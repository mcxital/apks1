---
description: "Прочитай skill github-actions і створи ci.sh, ci.bat та матричний GitHub Actions workflow для Maven."
name: "Create Actions"
argument-hint: "Describe the workflow triggers and checks to add"
---
Прочитай [skill github-actions](../skills/github-actions/SKILL.md) і створи `ci.sh`, `ci.bat` та `.github/workflows/ci.yml` для налаштованого Maven-проєкту.

Workflow має запускатися на `push` і `pull_request` у `develop` та `master`, перевіряти Ubuntu, Windows і macOS на JDK 17 та викликати саме відповідний скрипт (`ci.sh` або `ci.bat`). Перевір синтаксис YAML і матрицю; повідомляй про помилки явно.
