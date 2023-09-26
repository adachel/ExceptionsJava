package HomeWorks.HomeWork2.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Main {
    public static float inputFloat(){
        float number = 0;
        System.out.println("Введите число: ");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                number = scanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введите корректное число!");
            }
        }
        return number;
    }
    public static void main(String[] args) {
        System.out.println(inputFloat());
    }
}
