package HomeWorks.HomeWork3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке,
 * разделенные пробелом: Фамилия Имя Отчество, дата рождения, номер телефона, пол.

 * Форматы данных:
 *      фамилия, имя, отчество - строки
 *      дата рождения - строка формата dd.mm.yyyy
 *      номер телефона - целое беззнаковое число без форматирования
 *      пол - символ латиницей f или m.

 * Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым,
 * вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных,
 * чем требуется.

 * Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
 * Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
 * Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано,
 * пользователю выведено сообщение с информацией, что именно неверно.

 * Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии,
 * в него в одну строку должны записаться полученные данные, вида:
 * <Фамилия><Имя><Отчество><дата рождения> <номер телефона><пол>
 * Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

 * Не забудьте закрыть соединение с файлом.

 * При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано,
 * пользователь должен увидеть стектрейс ошибки.

 */
public class Main {
    public static void main(String[] args) throws ParseException {
        String data = "Петров Петр Петрович, 12.12.1982, 12345678, m";
        InputData inputData = new InputData();
        inputData.parseMetod(data);
        System.out.println(inputData);


    }
}
