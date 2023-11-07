# Toy Lottery Project

Приветствуем в проекте "Toy Lottery"! Это интерактивная система розыгрыша, предназначенная для использования в детских магазинах. Программа позволяет добавлять в систему игрушки с уникальной частотой выпадения, создавая захватывающий опыт розыгрыша для каждого участника.

## Особенности

- **Добавление игрушек**: Возможность добавить любое количество игрушек с заданными параметрами частоты выпадения.
- **Розыгрыш**: Случайный выбор игрушек на основе заданной частоты, гарантируя справедливость и случайность выбора.
- **Логирование**: Возможность сохранения результатов розыгрыша в файл для последующего анализа.

## Начало работы

Для использования "Toy Lottery", клонируйте репозиторий и следуйте инструкциям ниже.

```sh
git clone <url-репозитория>
cd ToyLotteryProject
# Компиляция и запуск программы
javac src/main/java/toy/Main.java
java -cp src/main/java toy.Main

Структура директории

    src/main/java/toy/: Код приложения.
        Toy.java: Класс, описывающий модель игрушки.
        ToyLottery.java: Логика розыгрыша игрушек.
        Main.java: Точка входа программы.
    src/main/java/utils/: Вспомогательные утилиты.
        Randomizer.java: Утилиты для работы с рандомизацией.
    src/test/java/toy/: Тесты для проверки логики приложения.
    src/main/resources/: Ресурсы и данные приложения.

Использование

Для запуска розыгрыша, создайте экземпляр класса ToyLottery и добавьте игрушки с помощью метода put. Затем вызовите метод get для получения ID выпавшей игрушки.
Вклад в проект

Мы рады любому вкладу в проект! Пожалуйста, ознакомьтесь с CONTRIBUTING.md для более подробной информации о том, как вы можете помочь улучшить "Toy Lottery".
Лицензия

Этот проект распространяется под лицензией Apache 2.0. Подробная информация содержится в файле LICENSE.