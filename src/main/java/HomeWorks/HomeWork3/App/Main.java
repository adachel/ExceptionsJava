package HomeWorks.HomeWork3.App;

import HomeWorks.HomeWork3.Method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Иванов Сергей Петрович 12.09.1975 1235678 f";
        System.out.println("Введите дaнные типa: Фамилия Имя Отчество дата рождения номер телефона пол, разделенные\n" +
                "пробелом");
        System.out.println("дата рождения - строка формата dd.mm.yyyy");
        System.out.println("номер телефона - целое беззнаковое число без форматирования");
        System.out.println("пол - символ латиницей f или m");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Method user = new Method();
        user.creatFiles(user.checkMethod(user.parseString(str)));
    }
}
