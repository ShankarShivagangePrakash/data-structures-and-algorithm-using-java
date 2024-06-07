package stacks;

public class StackTest {

    public static void main(String[] args){

        Stack stack = new Stack();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.getHeight();
        stack.printStack();

        Stack.Node peek = stack.peek();
        System.out.println("Peek on stack returned: " + ((peek != null) ? peek.getValue() : null));

        Stack.Node popElement1 = stack.pop();
        Stack.Node popElement2 = stack.pop();
        Stack.Node popElement3 = stack.pop();
        Stack.Node popElement4 = stack.pop();
        System.out.println("Popped element from stack is: " + ((popElement1 != null) ? popElement1.getValue() : null));
        System.out.println("Popped element from stack is: " + ((popElement2 != null) ? popElement2.getValue() : null));
        System.out.println("Popped element from stack is: " + ((popElement3 != null) ? popElement3.getValue() : null));
        System.out.println("Popped element from stack is: " + ((popElement4 != null) ? popElement4.getValue() : null));
        stack.getHeight();
        stack.printStack();
    }
}
