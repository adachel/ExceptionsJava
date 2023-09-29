package HomeWorks.HomeWork3.Data;

public class NumberPhone {
    public NumberPhone() {
    }
    public String checkNumberPhone(String s){
        int numPhone;
        try {
            numPhone = Integer.parseInt(s);
        } catch (NumberFormatException e){
            throw new NumberFormatException("Не верный формат номера толефона");
        }
        return String.valueOf(numPhone);
    }
}
