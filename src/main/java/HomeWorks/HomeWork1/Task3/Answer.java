package HomeWorks.HomeWork1.Task3;

/**
 * Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b,
 * и возвращающий новый массив с, каждый элемент которого равен частному элементов двух входящих массивов
 * в той же ячейке.

 * Если длины массивов не равны - верните нулевой массив длины 1.

 * Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException,
 * т.е. ваше.

 * Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает на вход два параметра:

 * int[] a - первый массив
 * int[] b - второй массив
 */
public class Answer {
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int[] c = new int[a.length];
        if (a.length == 0 || b.length == 0 || a.length != b.length){
            return new int[1];
        }else {
            for (int i = 0; i < c.length; i++){
                if (b[i] == 0){
                    throw new RuntimeException("Division by zero!");
                }else {
                    c[i] = a[i] / b[i];
                }
            }
            return c;
        }
    }
}
