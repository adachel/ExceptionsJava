package HomeWorks.HomeWork3.Data;

import java.util.zip.DataFormatException;

public class DateFormat {
    public DateFormat() {
    }
    public String checkDateFormat(String s){
        String[] arr = s.split("\\.");
        try {
            if (arr.length != 3){
                throw new NumberFormatException();
            }
            if (Integer.parseInt(arr[0]) < 1 || Integer.parseInt(arr[0]) > 31){
                throw new DataFormatException("Не правильный день");
            }
            if (Integer.parseInt(arr[1]) < 1 || Integer.parseInt(arr[1]) > 12){
                throw new DataFormatException("Не правильная месяц");
            }
            if (Integer.parseInt(arr[2]) < 1 || Integer.parseInt(arr[2]) > 2023){
                throw new DataFormatException("Не правильный год");
            }
        } catch (NumberFormatException e){
            throw new NumberFormatException("Не верный формат ввода даты");
        } catch (DataFormatException e) {
            throw new RuntimeException(e);
        }
        return arr[0] + "." + arr[1] + "." + arr[2];
    }
}
