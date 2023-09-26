package Seminars.Seminar1.Task3;

import java.util.Arrays;

// нужно checkArray, принимaет двумерный Intenger. Если в ячейке null,
// то оповещaем пользовaтеля. Укaзaть все ячейки де null/
public class Main {
    public static Integer[][] creatArr(int lenX, int lenY) {
        Integer[][] arrStr = new Integer[lenX][lenY];
        for (int i = 0; i < lenX; i++) {
            for (int j = 0; j < lenY; j++) {
                arrStr[i][j] = (int) (Math.random() * 0) + (int) (Math.random() * 2);
            }
        }
        return arrStr;
    }

    public static void checkArray(Integer[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                stringBuilder.append(i).append(" ");
            }
        }
        if (!stringBuilder.isEmpty()) {
            throw new RuntimeException(stringBuilder.toString());
        }

    }

    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(creatArr(5, 6)));
        Integer[] arr = new Integer[]{null, 1, 2, null};
        checkArray(arr);

    }
}
