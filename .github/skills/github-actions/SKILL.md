---
name: github-actions
description: "Створюй скрипти збірки ci.sh і ci.bat та GitHub Actions CI для Maven-проєкту з матрицею Linux, Windows і macOS."
---

# Skill: github-actions

## Коли застосовувати
Використовуй для створення скриптів збірки та CI workflow Maven-проєкту.

## Вхідні дані
Налаштований Maven-проєкт із `pom.xml`.

## Результат
- `ci.sh` для Linux/macOS із `#!/usr/bin/env bash`, `set -e` та запуском `mvn -B clean package`.
- `ci.bat` для Windows із `mvn -B clean package || exit /b 1`.
- `.github/workflows/ci.yml` на `push` і `pull_request` для гілок `develop` та `master`. Матриця: `ubuntu-latest`, `windows-latest`, `macos-latest`; JDK 17 через `actions/setup-java@v4`. Workflow запускає `./ci.sh` на Unix або `.\ci.bat` на Windows.

## Перевірка та помилки
1. Перевір синтаксис YAML і наявність усіх трьох ОС у матриці.
2. Переконайся, що workflow викликає саме `ci.sh` / `ci.bat`, а не запускає команду збірки напряму.
3. Використовуй мінімальні дозволи, не додавай секрети та явно повідомляй про невдалі перевірки.
