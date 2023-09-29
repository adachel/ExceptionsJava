package HomeWorks.HomeWork3.Data;

import HomeWorks.HomeWork3.Exceptions.ArrayLengthException;
import HomeWorks.HomeWork3.Methods;

public class MyFio {
    public MyFio() {
    }
    public void checkMyFio(String fio) {
        String[] arr = fio.split(" ");
        Methods.arrLenCheck(arr, 3);
//        if (arr.length < 3) {
//            throw new ArrayLengthException("Не достает данных в ФИО");
//        }
//        if (arr.length > 3) {
//            throw new ArrayLengthException("Лишние данные в ФИО");
//        }
    }
}
