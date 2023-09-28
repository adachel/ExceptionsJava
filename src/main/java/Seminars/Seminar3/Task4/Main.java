package Seminars.Seminar3.Task4;

import java.util.zip.DataFormatException;

/**
 * 1. Напишите метод, на вход которого подаётся двумерный строковый массив
 * размером 4х4. При подаче массива другого размера необходимо бросить
 * исключение MyArraySizeException.
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в
 * int и просуммировать. Если в каком-то элементе массива преобразование
 * не удалось (например, в ячейке лежит символ или текст вместо числа),
 * должно быть брошено исключение MyArrayDataException с детализацией, в
 * какой именно ячейке лежат неверные данные.
 * 3. В методе main() вызвать полученный метод, обработать возможные
 * исключения MyArraySizeException и MyArrayDataException и вывести
 * результат расчета (сумму элементов, при условии, что подали на вход
 * корректный массив).
 */
public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "t", "4"}
        };
        try {
            System.out.println(metod1(arr));
        } catch (MyArrayDataException | MyArraySizeException e){
            System.out.println(e.getMessage());
        }
    }
    public static int metod1(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4 || arr.length != 4){
                throw new MyArraySizeException(arr.length, arr[i].length);
            }
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }

            }
        }
        return sum;
    }
}
