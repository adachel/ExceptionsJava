package HomeWorks.HomeWork2.Task4;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        if (string.isEmpty()){
            throw new RuntimeException("Пустые строки вводить нельзя");
        }
    }
}
