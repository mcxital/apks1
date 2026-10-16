---
name: build-and-test
description: "Налаштовуй Maven-збірку й JUnit 5. Використовуй для створення pom.xml, компіляції та тестування Java-проєкту."
---

# Skill: build-and-test

## Коли застосовувати
Використовуй для налаштування Maven-збірки та JUnit-тестування.

## Вхідні дані
Вихідний код у `src/main/java/com/example/Hello.java`.

## Результат
- `pom.xml` для Java 17 із залежністю `org.junit.jupiter:junit-jupiter:5.10.2`.
- Плагіни `maven-surefire-plugin` та `maven-jar-plugin`; у маніфесті JAR вказано `com.example.Hello` як `mainClass`.
- `src/test/java/com/example/HelloTest.java` із тестом `@Test void BasicAddition()`, який перевіряє `Hello.add(2, 2) == 4`.

## Перевірка та помилки
1. Виконай `mvn test-compile` або `mvn test`.
2. При помилці компіляції чи падінні тесту виведи лог Maven і зупини етап.
3. Не пропускай тести та не приховуй помилки збірки.
