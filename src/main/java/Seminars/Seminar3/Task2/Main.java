package Seminars.Seminar3.Task2;

import java.io.IOException;

/**
 * Создайте класс Счетчик, у которого есть метод add(), увеличивающий
 * значение внутренней int переменной на 1. Сделайте так, чтобы с объектом
 * такого типа можно было работать в блоке try-with-resources. Нужно бросить
 * исключение, если работа с объектом типа счетчик была не в ресурсном try
 * и/или ресурс остался открыт. Подумайте какой тип исключения подойдет
 * лучше всего.
 */
public class Main {
    public static void main(String[] args) {
        try (Counter counter = new Counter(5)){
            counter.add();
            counter.close();
            counter.add();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
