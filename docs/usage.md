# Використання

## Java-проєкт

Потрібні JDK 17+ та Maven 3.8+. З кореня репозиторію:

```sh
mvn test
mvn clean package
java -cp target/hello-world-1.0-SNAPSHOT.jar com.example.Hello
```

Локальну CI-збірку можна запустити через `./ci.sh` на Linux/macOS або `ci.bat` на Windows. Workflow `.github/workflows/ci.yml` виконує ці ж скрипти на трьох ОС для `develop` та `master`.

## GitHub Copilot у VS Code

Відкрийте репозиторій у VS Code з GitHub Copilot Chat. Доступні команди:

- `/git-init` — перевірити Git і правила `.gitignore`, зокрема `target/`.
- `/create-project` — прочитати skill `project-scaffold` і створити клас `Hello`.
- `/create-build` — прочитати skill `build-and-test` і налаштувати Maven та JUnit.
- `/create-actions` — прочитати skill `github-actions` і створити скрипти та workflow.
- `/check` — перевірити структуру, зібрати Maven-проєкт, виконати тест та перевірити JAR і Git status без зміни файлів.
- `/init` — оркеструвати всі етапи в правильному порядку й зупинитися на першій помилці.

Agent **Java Build & CI/CD Engineer** описує загальну роль і критерії завершення. Skills містять покрокові процедури; prompts — окремі команди та оркестрацію.

## Перевірка результату

Успішна збірка створює `target/hello-world-1.0-SNAPSHOT.jar`; запуск класу з JAR має вивести `Hello, World!`. Maven також має показати успішний тест `BasicAddition`. `target/` і тимчасові файли IDE ігноруються Git.
