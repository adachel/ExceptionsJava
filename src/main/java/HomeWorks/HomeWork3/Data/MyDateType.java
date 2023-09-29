package HomeWorks.HomeWork3.Data;

import HomeWorks.HomeWork3.Exceptions.InvalidDateFormat;

public class MyDateType {
    public MyDateType() {
    }

    public void myDateTypeCheck(String string) {

        String[] arr = string.split("\\.");

        if (Integer.parseInt(arr[0]) < 1 || Integer.parseInt(arr[0]) > 31){
            throw new InvalidDateFormat("Неверная дата");
        }
        if (Integer.parseInt(arr[1]) < 1 || Integer.parseInt(arr[1]) > 12){
            throw new InvalidDateFormat("Неверный месяц");
        }
        if (Integer.parseInt(arr[2]) < 1000 || Integer.parseInt(arr[1]) > 2023){
            throw new InvalidDateFormat("Неверный год");
        }
        String res = arr[0] + "." + arr[1] + "." + arr[2];
    }


}
