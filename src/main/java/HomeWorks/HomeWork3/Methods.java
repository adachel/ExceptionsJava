package HomeWorks.HomeWork3;

public abstract class Methods {
    public void arrLenCheck(String[] arr, int num){
        if (arr.length < num) {
            throw new ArrayLengthException("Не достаточно данных");
        } else if (arr.length > num) {
            throw new ArrayLengthException("лишние данные");
        }
    }
}
