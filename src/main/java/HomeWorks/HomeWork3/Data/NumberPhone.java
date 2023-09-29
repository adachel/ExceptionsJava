package HomeWorks.HomeWork3.Data;

public class NumberPhone {
    public NumberPhone() {
    }
    public void numberPhoneCheck(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e){
            System.out.println("неправильный номер телефона");
        }
    }
}
