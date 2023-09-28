package Seminars.Seminar3.Task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Задание №3
 * 1. Создайте класс исключения, который будет выбрасываться при делении на 0.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 *
 * 2. Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 *
 * 3. Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */
public class Main {
    public static void main(String[] args) throws FileNotFound {
//        int a = 4;
//        int b = 0;
//        try {
//            int c = a / b;
//        } catch (ArithmeticException e){
//            throw new DivisionByZeroException();
//        }

//        int[] arr = {1,2,3,4,5};
//        int j = 8;
//        try {
//            int c = arr[j];
//        } catch (IndexOutOfBoundsException e){
//            throw new IndexOutOfBounds(j);
//        }

        String path = "path to file";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            System.out.println("onono");
        } catch (FileNotFoundException e) {
            throw new FileNotFound(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
