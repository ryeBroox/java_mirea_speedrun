package practice_9.task2;

public class EmptyStringException extends IllegalArgumentException {
    public EmptyStringException() {
        super("Передана пустая строка!");
    }
}