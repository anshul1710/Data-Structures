import java.util.*;
class Stack <E> {

    int size=10;
    E arr[];
    int top=-1;


    Stack() {
        this.arr = (E[]) new Object[size];
        this.top = -1;
    }

    Stack(int size) {
        this.size = size;
        this.arr = (E[]) new Object[size];
        this.top = -1;
    }

    public void push(E pushedElement) {

            top++;
            arr[top] = pushedElement;
            System.out.println("Pushed element:" + pushedElement);
    }

    public E pop() {
            int returnedTop = top;
            top--;
           return arr[returnedTop];

    }

    public E peek() {
        return arr[top+1];
    }

    public boolean underflow() {
        if(top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean overflow() {
        if(size - 1 == top)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
public class StackArray {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.pop();
       System.out.println(stack.peek());
}
}

