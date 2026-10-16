---
description: "Оркеструй повну ініціалізацію Java/Maven проєкту послідовно через prompts git-init, create-project, create-build, create-actions і check."
name: "Init"
argument-hint: "Describe the project setup goals"
---
Ти — оркестратор. Спочатку прочитай [agent manifest](../agents/build-engineer.agent.md), а тоді послідовно виконай інструкції цих prompts:

1. [git-init](./git-init.prompt.md)
2. [create-project](./create-project.prompt.md)
3. [create-build](./create-build.prompt.md)
4. [create-actions](./create-actions.prompt.md)
5. [check](./check.prompt.md)

Не переходь до наступного етапу, якщо попередній завершився помилкою. Негайно зупинись і виведи звіт про помилку; не вигадуй успішні результати. Збережи наявні файли й не змінюй історію Git.
