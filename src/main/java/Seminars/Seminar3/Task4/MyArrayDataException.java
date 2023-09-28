package Seminars.Seminar3.Task4;

import java.util.zip.DataFormatException;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException() {
        super("не удaлось");
    }
    public MyArrayDataException(int i, int j) {
        super("не удaлось в ячейке " + (i + 1) + " x " + (j + 1));
    }

}
