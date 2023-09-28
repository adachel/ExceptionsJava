package HomeWorks.HomeWork3;

import java.util.Arrays;
import java.util.Scanner;

public class InputData extends Methods{
    private String fio;
    private String date;
    private String phone;
    private String geder;

    public InputData() {
    }

    public String getFio() {
        return fio;
    }

    public String getDate() {
        return date;
    }

    public String getPhone() {
        return phone;
    }

    public String getGeder() {
        return geder;
    }


    public void parseMetod(String data) {

        String[] arr = data.split(",");

        arrLenCheck(arr, 4);

        this.fio = arr[0].trim();
        this.date = arr[1].trim();
        this.phone = arr[2].trim();
        this.geder = arr[3].trim();
    }


    @Override
    public String toString() {
        return "InputData{" +
                "fio='" + fio + '\'' +
                ", date='" + date + '\'' +
                ", phone='" + phone + '\'' +
                ", geder='" + geder + '\'' +
                '}';
    }
}
