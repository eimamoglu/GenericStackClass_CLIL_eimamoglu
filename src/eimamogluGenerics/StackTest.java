package eimamogluGenerics;
/**
 * Test class
 * @author elyesaimamoglu
 * @version 20-02-2025
 */
public class StackTest {
    public static void main(String[]args){

        // TEST 1: Number Stack Int
        StackList<Integer> numberStack = new StackList<>(4);
        try {
            System.out.println("TEST 1: Push to Number");
            numberStack.push(1);
            numberStack.push(2);
            numberStack.push(3);
            System.out.println("Number Stack (list): " + numberStack.list());  // Expected: 1;2;3
        } catch (StackFullException e) {
            System.out.println("StackFullException caught: " + e.getMessage());
        }

        try {
            System.out.println("\nTEST 2: Peek Number");
            System.out.println("Peek: " + numberStack.peek());  // Expected: 3
        } catch (StackEmptyException e) {
            System.out.println("StackEmptyException caught: " + e.getMessage());
        }

        try {
            System.out.println("\nTEST 3: Pop from Number");
            System.out.println("Pop: " + numberStack.pop());    // Expected: 3
            System.out.println("Number Stack after pop: " + numberStack.list());  // Expected: 1;2
        } catch (StackEmptyException e) {
            System.out.println("StackEmptyException caught: " + e.getMessage());
        }

        // TEST 2: Text Stack String
        StackList<String> textStack = new StackList<>(3);
        try {
            System.out.println("\nTEST 4: Push to Text");
            textStack.push("Hello");
            textStack.push("World");
            System.out.println("Text Stack (list): " + textStack.list());  // Expected: Hello;World
        } catch (StackFullException e) {
            System.out.println("StackFullException caught: " + e.getMessage());
        }

        try {
            System.out.println("\nTEST 5: Pop from Text ");
            System.out.println("Pop: " + textStack.pop());  // Expected: World
            System.out.println("Pop: " + textStack.pop());  // Expected: Hello
        } catch (StackEmptyException e) {
            System.out.println("StackEmptyException caught: " + e.getMessage());
        }

        try {
            System.out.println("\nTEST 6: Pop from Empty Text");
            textStack.pop();  // StackEmptyException
        } catch (StackEmptyException e) {
            System.out.println("StackEmptyException caught: " + e.getMessage());
        }

        try {
            System.out.println("\nTEST 7: Peek on Empty Text Stack");
            System.out.println("Peek: " + textStack.peek());  // StackEmptyException
        } catch (StackEmptyException e) {
            System.out.println("StackEmptyException caught: " + e.getMessage());
        }
    }
}
