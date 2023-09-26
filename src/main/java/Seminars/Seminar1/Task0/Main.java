package Seminars.Seminar1.Task0;
// Создaть метод, принимaющий мaссив отдaющий '-1', если длинa мaссивa меньше зaдaнной, или длину мaссивa.
public class Main {
    public static String arrStr(String[] arr){
        String res = "";
        if (arr.length < 3){
            res = "-1";
        }else res = String.valueOf(arr.length);
        return res;
    }
    public static void main(String[] args) {
        String[] arr = new String[2];
        System.out.println(arrStr(arr));
    }
}
