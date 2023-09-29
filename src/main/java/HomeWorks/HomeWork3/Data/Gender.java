package HomeWorks.HomeWork3.Data;

import HomeWorks.HomeWork3.Exception.GenderFormatException;


public class Gender {
    public Gender() {
    }
    public String checkGender(String s){
        if (!s.equals("m") && !s.equals("f")){
            throw new GenderFormatException("Не верный выбор пола");
        }
        return s;
    }
}
