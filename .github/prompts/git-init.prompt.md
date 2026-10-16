---
description: "Перевір стан Git і онови .gitignore для Java/Maven, обов'язково виключивши target/; наприкінці виведи git status."
name: "Git Init"
argument-hint: "Optional repository setup requirements"
---
Перевір стан Git і налаштуй ігнорування для цього Java/Maven-проєкту.

1. Переглянь наявний репозиторій і `.gitignore`; не ініціалізуй Git повторно.
2. Додай `target/` до `.gitignore`, зберігши наявні правила, та за потреби додай `.idea/`, `*.iml` і `.vscode/`.
3. Не видаляй файли, не змінюй історію, не створюй коміт і не змінюй remote.
4. Виконай `git status` і виведи його фактичний результат разом із коротким звітом.
