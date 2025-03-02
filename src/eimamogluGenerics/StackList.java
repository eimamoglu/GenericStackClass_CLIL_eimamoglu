package eimamogluGenerics;
/**
 * StackList class
 * @author elyesaimamoglu
 * @version 20-02-2025
 */
public class StackList <T> {
    private Object[] oArray;
    private int topElement;
    private int maxCap;
    public StackList() {
        this.maxCap = 4;
        this.oArray = new Object[maxCap];
        this.topElement = -2;
    }
    public StackList(int maxCap) {
        this.maxCap = maxCap;
        this.oArray = new Object[maxCap];
        this.topElement = -1;
    }

    public void push(T item) throws StackFullException {
        if (topElement == maxCap - 1) {
            throw new StackFullException();
        }

        oArray[++topElement] = item;  // Increment topElement and add item
    }

    public T pop() throws StackEmptyException {
        if (topElement == -1) {
            throw new StackEmptyException();
        }
        T item = (T) oArray[topElement];
        oArray[topElement--] = null;
        return item;
    }

    public T peek() throws StackEmptyException {
        if (topElement == -1) {
            throw new StackEmptyException();
        }
        return (T) oArray[topElement];
    }

    public String list() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= topElement; i++) {
            sb.append(oArray[i]);
            if (i != topElement) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}