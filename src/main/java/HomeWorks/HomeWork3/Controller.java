package HomeWorks.HomeWork3;

import HomeWorks.HomeWork3.Data.Gender;
import HomeWorks.HomeWork3.Data.MyDateType;
import HomeWorks.HomeWork3.Data.MyFio;
import HomeWorks.HomeWork3.Data.NumberPhone;

public class Controller {
    private MyFio myFio = new MyFio();
    private MyDateType myDateType;
    private NumberPhone numberPhone;
    private Gender gender;

    public Controller() {
    }

    public void metod(String s){
        String[] arr = s.split(",");
        Methods.arrLenCheck(arr, 3);
        this.myFio.checkMyFio(arr[0].trim());
        this.myDateType.myDateTypeCheck(arr[1].trim());
        this.numberPhone.numberPhoneCheck(arr[2].trim());
        this.gender.genderCheck(arr[3].trim());
    }


    @Override
    public String toString() {
        return "Controller{" +
                "myFio=" + myFio +
                ", myDateType=" + myDateType +
                ", numberPhone=" + numberPhone +
                ", gender=" + gender +
                '}';
    }
}
