package Seminars.Seminar3.Task3;

import java.io.FileNotFoundException;

public class FileNotFound extends FileNotFoundException {
    public FileNotFound() {
        super("Фaйл не нaйден");
    }

    public FileNotFound(String path) {
        super("фaйлa по пути " + path + " нет");
    }
}
