package HomeWorks.HomeWork3.Data;

public class Gender {

    public Gender() {
    }
    public void genderCheck(String s) {
        if (s.length() > 1 || !s.equals("m") || !s.equals("f")){
            throw new NumberFormatException("Не верный формат выбора пола");
        }
    }


}
