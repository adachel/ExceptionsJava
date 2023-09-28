package HomeWorks.HomeWork3;

public class MyFio {
    public MyFio() {
    }

    public void checkFio(String fio) {
        String[] arr = fio.split(" ");
        if (arr.length < 3) {
            throw new ArrayLengthException("Не достает данных в ФИО");
        }
        if (arr.length > 3) {
            throw new ArrayLengthException("Лишние данные в ФИО");
        }
    }

}
