package LinkedListQues;
import java.util.*;
public class StackWithLinkedLIst {
    public static void main(String[] args) {


        LinkedList stack = new LinkedList();

      /*  stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.show();
*/
        Scanner s1 = new Scanner(System.in);
        char temp = 'z';
        System.out.println("type a to insert at push");
        System.out.println("type b to insert at pop");
        System.out.println("type c to insert at show");
        int temp1 = 0;
        while (temp != 'e') {
            temp = s1.next().charAt(0);
            switch (temp) {
                case 'a':
                    System.out.println("enter value");
                    temp1 = s1.nextInt();
                    stack.push(temp1);
                    break;
                case 'b':
                    stack.pop();
                    break;
                case 'c':
                    stack.show();
                    break;
                case 'e':
                    break;
            }
        }
    }
}
