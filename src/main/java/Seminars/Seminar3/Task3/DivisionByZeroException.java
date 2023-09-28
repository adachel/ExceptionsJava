package Seminars.Seminar3.Task3;

/**
 * 1. Создайте класс исключения, который будет выбрасываться при делении на 0.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */
public class DivisionByZeroException extends ArithmeticException{
    public DivisionByZeroException() {
        super("Деление нa '0' зaпрещено");
    }
}
