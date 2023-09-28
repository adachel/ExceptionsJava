package Seminars.Seminar3.Task4;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super();
    }

    public MyArraySizeException(int rows, int columns) {
        super("рaзмер не 4 х 4, a " + rows + " x " + columns);
    }
}
