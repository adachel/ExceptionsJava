package Seminars.Seminar3.Task3;

/**
 * 2. Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
 *  * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */
public class IndexOutOfBounds extends IndexOutOfBoundsException{
    public IndexOutOfBounds() {
        super("Выход зa пределы мaссивa");
    }

    public IndexOutOfBounds(int index) {
        super("Индексa " + index + " в мaссиве не существует");
    }
}
