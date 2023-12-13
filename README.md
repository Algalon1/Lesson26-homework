# Описание проекта

Проект представляет пример использования классов на языке Java для моделирования транспортных средств.

## Классы

### Vehicle

`Vehicle` - базовый класс, представляющий транспортное средство.

#### Поля

- `String make` - марка транспортного средства.
- `int year` - год выпуска транспортного средства.

#### Методы

- `displayInfo(): String` - возвращает информацию о транспортном средстве в виде строки.

### Car

`Car` - подкласс класса `Vehicle`, представляющий автомобиль с дополнительной характеристикой - моделью.

#### Поля

- `String model` - модель автомобиля.

#### Методы

- `toString(): String` - возвращает строковое представление автомобиля.
- `displayInfo(): String` - возвращает информацию об автомобиле в виде строки, включая модель.

## Main

`Main` - класс с методом `main`, демонстрирующий использование классов `Vehicle` и `Car`.

#### Методы

- `main(String[] args)`: точка входа в приложение, создаёт экземпляры `Vehicle` и `Car`, выводит информацию о них в консоль.

## Пример использования

```java
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("BMW", 2015);
        System.out.println(vehicle.displayInfo());

        Car car = new Car("Toyota", 2023, "Camry");
        System.out.println(car.displayInfo());
    }
}
```

## Автор

[Algalon1](https://github.com/Algalon1)