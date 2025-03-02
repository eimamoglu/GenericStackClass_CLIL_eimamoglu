package eimamogluGenerics;
/**
 * StackFull Exeption class
 * @author elyesaimamoglu
 * @version 20-02-2025
 */
public class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
    public StackFullException() {
        super("Stack is full");
    }
}
