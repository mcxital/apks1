---
name: project-scaffold
description: "Створюй початкову структуру Java-проєкту Maven. Використовуй для розгортання hello-world на Java 17+ з пакетом com.example, README та .gitignore."
---

# Skill: project-scaffold

## Коли застосовувати
Використовуй для початкового розгортання структури Java-проєкту `hello-world`.

## Вхідні дані
- Назва проєкту: `hello-world`
- Мова та версія: Java 17+
- Пакет: `com.example`

## Результат
- `.gitignore`, що містить `target/`, `.idea/`, `*.iml` та `.vscode/`.
- `README.md` з описом і командами запуску.
- `src/main/java/com/example/Hello.java` з `main`, що виводить `Hello, World!`, і статичним методом `public static int add(int a, int b)`.

## Перевірка та помилки
1. Перевір наявність `src/main/java/com/example/Hello.java` та `.gitignore`.
2. Якщо каталог не вдається створити, зупини процес і виведи помилку доступу, не підміняючи її успішним результатом.
3. Не перезаписуй та не видаляй наявні файли без перевірки їхнього вмісту.
