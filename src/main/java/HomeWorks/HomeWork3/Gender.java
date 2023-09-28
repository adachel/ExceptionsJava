package HomeWorks.HomeWork3;

public class Gender {
    public Gender(String s) {
        if (s.length() > 1 || !s.equals("m") || !s.equals("f")){
            throw new NumberFormatException("Не верный формат выбора пола");
        }
    }

    public Gender() {
    }
}
