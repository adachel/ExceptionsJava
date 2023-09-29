package HomeWorks.HomeWork3;

import HomeWorks.HomeWork3.Exceptions.ArrayLengthException;

public abstract class Methods {
    public static void arrLenCheck(String[] arr, int num){
        if (arr.length < num) {
            throw new ArrayLengthException("Не достаточно данных");
        } else if (arr.length > num) {
            throw new ArrayLengthException("лишние данные");
        }
    }
}
