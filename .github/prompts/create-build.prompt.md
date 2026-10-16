---
description: "Прочитай skill build-and-test і створи Maven pom.xml для Java 17 та JUnit-тест HelloTest.BasicAddition."
name: "Create Build"
argument-hint: "Describe the required build or test behavior"
---
Прочитай [skill build-and-test](../skills/build-and-test/SKILL.md) і налаштуй відповідно до нього Maven-збірку та JUnit 5: створи `pom.xml` і `src/test/java/com/example/HelloTest.java` з тестом `BasicAddition`, який перевіряє `Hello.add(2, 2) == 4`.

Запусти `mvn test` або `mvn test-compile`. Якщо компіляція чи тест завершується помилкою, виведи лог Maven і зупинись. Не повідомляй про успішну перевірку, якщо Maven недоступний.
