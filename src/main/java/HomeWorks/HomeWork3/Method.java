package HomeWorks.HomeWork3;

import HomeWorks.HomeWork3.Data.DateFormat;
import HomeWorks.HomeWork3.Data.Gender;
import HomeWorks.HomeWork3.Data.NumberPhone;
import HomeWorks.HomeWork3.Exception.ArraySizeException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Method {
    private final DateFormat dateFormat = new DateFormat();
    private final Gender gender = new Gender();
    private final NumberPhone numberPhone = new NumberPhone();

    public Method() {
    }
    public String[] parseString(String s){
        String[] arr = s.split("\\s+");
        if (arr.length > 6) throw new ArraySizeException("Лишние данные");
        if (arr.length < 6) throw new ArraySizeException("Недостаточно данных");
        return arr;
    }
    public String checkMethod(String[] arr){
        String name = arr[0] + " " + arr[1] + " " + arr[2];
        String date = dateFormat.checkDateFormat(arr[3]);
        String numPhone = numberPhone.checkNumberPhone(arr[4]);
        String gen = gender.checkGender(arr[5]);
        return name + " " + date + " " + numPhone + " " + gen;
    }
    public void creatFiles(String s) {
        String[] arr = s.split("\\s+");
        try {
            Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains\\ExceptionsJava\\src\\" +
                    "main\\java\\HomeWorks\\HomeWork3\\Output\\" + arr[0] + ".txt");
            if (Files.notExists(output)) Files.createFile(output);
            Files.writeString(output, "<" + arr[0] + ">" + "<" + arr[1] + ">" + "<" + arr[2] + ">" + "<" +
                    arr[3] + ">" + "<" + arr[4] + ">" + "<" + arr[5] + ">" + '\n', StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException("Не корректный путь к файлу");
        }
    }
}
