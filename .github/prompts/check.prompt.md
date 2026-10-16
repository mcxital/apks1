---
description: "Без змін перевір manifest, skills, prompts, workflow, виконай Maven package та перевір BasicAddition, JAR і git status."
name: "Check"
argument-hint: "Optional area or files to check"
---
Не змінюй файли. Перевір наявність agent manifest, усіх skills, prompts, Maven-файлів, скриптів і workflow. Потім:

1. Запусти `mvn clean package`; якщо Maven або JDK недоступний чи команда завершується помилкою, виведи фактичну помилку і зупини перевірку.
2. Переконайся, що тест `BasicAddition` пройшов і в `target/` створився `.jar`.
3. Перевір, що `git status --short --ignored` показує `target/` як ігнорований, а звичайний `git status --short` не показує файлів із `target/`.
4. Виведи результати кожної перевірки; не роби висновків про успіх без фактичних доказів.
