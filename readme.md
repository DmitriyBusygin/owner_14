**Представлен базовый проект, включающий в себя работу с Owner.**

**Для запусков api тестов:**

- через конфигурационный файл `gradle clean test --tests ApiTest`
- с параметрами `gradle clean test --tests ApiTest -Durl=www -Dtoken=123`

**Для запусков web тестов:**

- локальный запуск через конфигурационный файл  `gradle clean test --tests WebTests -DlocalOrRemote=local`
- удаленный запуск через конфигурационный файл  `gradle clean test --tests WebTests -DlocalOrRemote=remote`
