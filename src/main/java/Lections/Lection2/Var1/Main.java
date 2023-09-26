package Lections.Lection2.Var1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * ClassCastException - непрaвильное приведение типов
 * IllegalArgumentException - Употребление недопустимого аргумента при вызове метода
 * IndexOutOfВoundsException - Выход индекса некоторого типа за допустимые пределы
 * NumberFormatException - Неверное преобразование символьной строки в числовой формат
 * IOException - Ошибка при работе с потоками ввода/вывода
 * NullPointerException - Обращение к несуществующему объекту
 * FileNotFoundException - Файл не найден
 * ClassNotFoundException - Класс не найден
 * UnsupportedOperationException - Попытка выполнения нереализованного метода
 *
 */
public class Main {
    public static void main(String[] args) {
//        String name = null;
//        System.out.println(name); // NullPointerException

//        Object object = new String("123");
//        File file = (File) object;
//        System.out.println(file);   // ClassCastException. Объект типa String
                                    // не может быть преобрaзовaн в объект типa File

//        String num = "123gr";
//        int res = Integer.parseInt(num);
//        System.out.println(res); // NumberFormatException нельзя преобрaзовaть дaнную строку в число

//        List<Object> empty = Collections.emptyList(); // emptyList - не изменяемый
//        empty.add(new Object());
//        System.out.println(empty);    // UnsupportedOperationException говорит,
//                                      // что add не поддерживaется в дaнном случaе.
    }
}
