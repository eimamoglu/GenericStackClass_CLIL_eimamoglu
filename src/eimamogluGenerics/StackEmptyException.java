package eimamogluGenerics;
/**
 * Stackempty exception class
 * @author elyesaimamoglu
 * @version 20-02-2025
 */
public class StackEmptyException extends Exception{
    public StackEmptyException(String message){
        super(message);
    }
    public StackEmptyException() {
        super("Stack is empty");
    }
}
