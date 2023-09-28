package HomeWorks.HomeWork3;

public class NumberPhone {
    public NumberPhone(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e){
            System.out.println("неправильный номер телефона");
        }
    }
}
