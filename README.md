# Hello World — Java, Maven, JUnit

**Студент:** Максим Юнко

**Група:** КІ-404

**Варіант:** 5 (Java, Maven, JUnit)

Навчальний кросплатформний Java-проєкт. Клас `com.example.Hello` виводить `Hello, World!` і містить метод додавання двох цілих чисел. Збірка керується Maven, тести написані на JUnit 5, а GitHub Actions перевіряє проєкт на Ubuntu, Windows та macOS.

## Вимоги

- JDK 17 або новіший
- Apache Maven 3.8+

## Збірка та запуск

У корені репозиторію виконайте:

```sh
mvn test
mvn package
java -jar target/hello-world-1.0.0.jar
```

Очікуваний вивід програми:

```text
Hello, World!
```

Для локальної CI-перевірки використовуйте `./ci.sh` на Linux/macOS або `ci.bat` у Windows. Тест `BasicAddition` перевіряє `Hello.add(2, 2) == 4`.

## Структура

- `src/main/java/com/example/Hello.java` — приклад програми.
- `src/test/java/com/example/HelloTest.java` — модульний тест.
- `pom.xml` — залежності та налаштування Maven.
- `.github/` — agent, skills, prompts та workflow автоматизації.
- [Архітектура](./docs/architecture.md) та [інструкція використання](./docs/usage.md).
