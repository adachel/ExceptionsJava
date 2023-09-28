package Seminars.Seminar3.Task1;

import java.io.IOException;

/**
 * Создайте метод doSomething(), который может быть источником одного из
 * типов checked exceptions (тело самого метода прописывать не обязательно).
 * Вызовите этот метод из main и обработайте в нем исключение, которое
 * вызывает метод doSomething().
 */
public class Main {
    public static void main(String[] args) {
        try {
            doSomething();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void doSomething() throws IOException {}
}
