import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<Integer>();
        stack.push(18);
        stack.push(79);
        stack.push(45);
        stack.push(9);
        stack.push(23);
        System.out.println(stack);

        stack.pop(); //it will delete last element because stack follows LAST IN FIRST OUT
        System.out.println(stack);

        System.out.println(stack.peek()); //peek returns the top element without removing it

        System.out.println(stack.search(18)); //it returns the position of element and counts from the last element(top of the stack) means in this program 9 is on the topmost of the stack ,it returns 1

        System.out.println(stack.isEmpty()); //isEmpty() or empty() is used

        System.out.println(stack.size());
        
        System.out.println(stack.contains(8));


    }
    
}
