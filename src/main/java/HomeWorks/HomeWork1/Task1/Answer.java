package HomeWorks.HomeWork1.Task1;

/**
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

 * Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива

 * Метод divisionByZero - Деление на 0

 * Метод numberFormatException - Ошибка преобразования строки в число

 * Важно: они не должны принимать никаких аргументов
 */


public class Answer {
    public static void arrayOutOfBoundsException() {
        int[] arr = new int[5];
        for (int i = 0; i < 10; i++) {
            int a = arr[i];
        }
    }

    public static void divisionByZero() {
        int a = 10;
        int b = 0;
        int c = a / b;

    }

    public static void numberFormatException() {
        String a = "a";
        int b = 10;
        int c = Integer.parseInt(a) + b;

    }
}
