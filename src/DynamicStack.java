import java.util.*;
class Stack1 <E> {

    int size = 10;
    E arr[];
    int top = -1;
    int cap = 2;

    Stack1() {
        size = cap;
        this.arr = (E[]) new Object[size];
        this.top = 0;
    }

    Stack1(int size) {
        cap = size;
        this.size = size;
        this.arr = (E[]) new Object[size];
        this.top = 0;

    }

    public void expand() {
        int len = size();
        E newStack[] = (E[]) new Object[cap * 2];
        System.arraycopy(arr, 0, newStack, 0, len);
        arr = newStack;
        cap *= 2;

    }

    public void push(E pushedElement) {
        if (size() == cap)
            expand();
        arr[top] = pushedElement;
        top++;
        System.out.println("Pushed element:" + pushedElement);

    }

    public int size() {
        return top;
    }

    public E pop() {

        int returnedTop = top;
        top--;
        E res=arr[returnedTop];
        System.out.println("Popped element :" + arr[returnedTop]);
        shrink();
        return res;
    }

    public void shrink()
    {
        int len=size();
        if(len<=(cap/2)/2)
        {
            cap=cap/2;
        }
        E newStack[]=(E[]) new Object[cap];
        System.arraycopy(arr, 0, newStack, 0, len);
        arr = newStack;
    }
    public E peek() {
        return arr[top-1];
    }

    public boolean underflow() {
        if(top == 0)
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
    public void show()
    {
        for (E n:
        arr) {
            System.out.println(n);
        }
    }
}
public class DynamicStack {

    public static void main(String[] args) {

        Stack1<Integer> stack = new Stack1();
        stack.push(5);
       stack.push(4);
        stack.push(3);
        stack.push(2);
        //stack.push(1);
        //stack.pop();
        System.out.println(stack.peek());
        stack.show();
    }


}

