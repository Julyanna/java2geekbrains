package lesson2;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j) {
        super("Не удалось преобразовать строку в число в ячейке: " + i + " " + j );
    }
}
