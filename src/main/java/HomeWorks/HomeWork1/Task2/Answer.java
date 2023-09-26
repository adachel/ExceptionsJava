package HomeWorks.HomeWork1.Task2;

/**
 * Реализуйте метод subArrays, принимающий в качестве аргументов два целочисленных массива a и b,
 * и возвращающий новый массив c, каждый элемент которого равен разности элементов двух входящих массивов
 * в той же ячейке.

 * Если длины массивов не равны - верните нулевой массив длины 1.

 * Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает на вход два параметра:

 * int[] a - первый массив
 * int[] b - второй массив
 */
public class Answer {
    public int[] subArrays(int[] a, int[] b){
        int[] c = new int[1];
        int[] d = new int[a.length];
        if (a.length != b.length){
            return c;
        }else {
            for (int i = 0; i < d.length; i++) {
                d[i] =a[i] - b[i];
            }
            return d;
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

