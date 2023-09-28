package HomeWorks.HomeWork3;

public class Data {
    private MyFio myFio;
    private MyDateType myDateType;
    private NumberPhone numberPhone;
    private Gender myGender;
    private InputData inputData;

    public Data(MyFio myFio, MyDateType myDateType, NumberPhone numberPhone, Gender myGender) {
        this.myFio = myFio;
        this.myDateType = myDateType;
        this.numberPhone = numberPhone;
        this.myGender = myGender;
    }

    public void inputFio(){
        myFio.checkFio(inputData.getFio());
    }
    public void inputDate(){
        myFio.checkFio(inputData.getDate());
    }
    public void inputPhone(){
        myFio.checkFio(inputData.getPhone());
    }
    public void inputGender(){
        myFio.checkFio(inputData.getGeder());
    }



















    //    private MyFio myFio;
//    private MyDateType myDate;
//    private NumberPhone numPhone;
//    private char gender;
//
//
//    public Data() {
//    }
//
//    public void inputData() {
//        System.out.println("введите дaнные");
//        Scanner in = new Scanner(System.in);
//        String[] arr = in.nextLine().split(",");
//        System.out.println(Arrays.toString(arr));
//
//        if (arr.length < 4) {
//            throw new ArrayLengthException("Не достаточно данных");
//        } else if (arr.length > 4) {
//            throw new ArrayLengthException("лишние данные");
//        }
//
//        this.myFio = new MyFio(arr[0]);
//        this.myDate = new MyDateType(arr[1].trim());
//        this.numPhone = new NumberPhone(arr[2].trim());
//        this.gender = arr[3].trim().charAt(0);
//    }

}
