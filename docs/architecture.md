# Архітектура

Проєкт поєднує Java-приклад `hello-world` на Maven/JUnit 5 з інструкціями GitHub Copilot для відтворюваного налаштування та перевірки.

## Потік налаштування: manifest → skills → commands → orchestrator

1. **Manifest (agent)** — [`build-engineer.agent.md`](../.github/agents/build-engineer.agent.md) визначає роль Java Build & CI/CD Engineer, межі безпеки та критерії завершення: Maven-проєкт, JUnit-тест, виконуваний JAR і матричний CI.
2. **Skills** — каталог [`skills/`](../.github/skills/) містить процедури окремих етапів:
   - `project-scaffold` створює Maven-структуру та `Hello.java`;
   - `build-and-test` налаштовує `pom.xml` і `BasicAddition`;
   - `github-actions` створює локальні CI-скрипти та workflow.
3. **Commands (prompts)** — [`prompts/`](../.github/prompts/) надає окремі команди для Git, створення проєкту, збірки, Actions і перевірки. Кожна команда делегує конкретну процедуру відповідному skill.
4. **Orchestrator** — [`init.prompt.md`](../.github/prompts/init.prompt.md) читає manifest і послідовно запускає Git setup → scaffold → build/test → Actions → перевірку. У разі помилки він зупиняє процес, не оголошуючи його успішним.

## Build та CI

Maven компілює код з цільовою версією Java 17, виконує JUnit 5 тести через Surefire і пакує JAR із `com.example.Hello` як main class. `ci.sh` та `ci.bat` запускають одну й ту саму команду `mvn -B clean package`. GitHub Actions викликає відповідний скрипт на Ubuntu, Windows і macOS для `push` та `pull_request` у `develop` і `master`. Каталог `target/` виключений через `.gitignore`.
