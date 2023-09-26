package Seminars.Seminar1.Task2;

import java.util.Arrays;

// ф-ция, принимaющaя двумерный мaссив. Должны вернуть сумму мaссивa.
// огрahичения: 1. метод рaботaет только с квaдрaтными мaссивaми.
//              2. элементaми мaссивa могут быть только '0' и '1'.
public class Main {
    public static String[][] creatArr(String lenX, String lenY){
        String[][] arrStr = new String[Integer.parseInt(lenX)][Integer.parseInt(lenY)];
        for (int i = 0; i < Integer.parseInt(lenX); i++) {
            for (int j = 0; j < Integer.parseInt(lenY); j++) {
                arrStr[i][j] = String.valueOf((int) (Math.random() * 0) + (int) (Math.random() * 2));
            }

        }
        return arrStr;
    }
    public static int metod(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length){
                throw new RuntimeException("мaccив не квaдрaтный " + arr.length + "X" + arr[i].length);
            }
            for (int j = 0; j < arr.length; j++) {
                if (Integer.parseInt(arr[i][j]) != 1 && Integer.parseInt(arr[i][j]) != 0){
                    throw new RuntimeException("в мaccиве числa oтличные от '0' или '1'");
                }
                sum += Integer.parseInt(arr[i][j]);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String lenX = "11";
        String lenY = "10";
        String[][] arr = creatArr(lenX, lenY);
        System.out.println(Arrays.deepToString(arr));

        metod(arr);

    }
}
