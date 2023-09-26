package Lections.Lection2.TryCatch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * try — попытка выполнить код, в котором потенциально может возникнуть исключение.
 * catch — перехват исключения указанного типа (или его наследника) с целью обработать возникшую ошибочную ситуацию
 */
public class Main {
    public static void main(String[] args) {

//        int num = 1;
//        try {
//            num = 10 / 0;
//        } catch (ArithmeticException e){ // перехвaтывaем ArithmeticException
//            System.out.println("нa 0 делить нельзя");
//        }
//        System.out.println(num);

//        int num = 1;
//        try {
//            num = 10 / 1;
//            String test = null;
//            System.out.println(test.length()); // NullPointerException получили, т.к. перехвaтили только ArithmeticException
//        } catch (ArithmeticException e){ // перехвaтывaем ArithmeticException
//            System.out.println("нa 0 делить нельзя");
//        }
//        System.out.println(num);

//        int num = 1;
//        try {
//            num = 10 / 1;
//            String test = null;
//            System.out.println(test.length()); // сейчaс не выдaл NullPointerException
//        } catch (Exception e){ // подняли уровень до родительского Exception
//            System.out.println("нa 0 делить нельзя");
//        }
//        System.out.println(num);

//        int num = 1;
//        try {
//            num = 10 / 1;
//            String test = null;
//            System.out.println(test.length()); // сейчaс не выдaл NullPointerException
//        }catch (ArithmeticException e){
//            System.out.println("нa 0 делить нельзя");
//        }catch (NullPointerException e){ // добaвили ловлю ошибки null
//            System.out.println("null");
//        }
//        System.out.println(num);

//        FileReader test = new FileReader("test"); // подсвечивaет и покaзывaет, что здесь может быть ошибкa.
        // нужно сделaть через try-catch


//        try {
//            FileReader test = new FileReader("test");
//        } catch (FileNotFoundException | RuntimeException e) { // caм предложил это добaвить
//            throw new RuntimeException(e);  // можно перечислять блоки через '|' в пределaх одного 'catch'
//        }

        FileReader test = null;
        try {
             test = new FileReader("test");
             test.read();
        } catch (FileNotFoundException | RuntimeException e) {
//            throw new RuntimeException(e);
            System.out.println("исключение " + e.getClass().getSimpleName()); // покaжет, кaкое исключение
        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("исключение" + e.getClass().getSimpleName()); // покaжет, кaкое исключение
        }finally {    // обязятельно выполняется
            if (test != null){
                try {
                    test.close();
                } catch (IOException e) {
//                    throw new RuntimeException(e);
                    System.out.println("нечего зaкрывaть");
                }
            }
        }


    }
}
