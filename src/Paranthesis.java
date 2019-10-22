import java.util.*;
public class Paranthesis {
    static class stack12
    {
        static int top=-1;
        static char items[] = new char[100];

        static void push(char x)
        {
            if (top == 99)
            {
                System.out.println("Stack full");
            }
            else
            {
                items[++top] = x;
            }
        }

        static char pop()
        {

                char element = items[top];
                top--;
                return element;

        }

        static boolean isEmpty()
        {
            if(top==-1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    public static boolean check(String str) {
        char ch[] = str.toCharArray();
        stack12 s = new stack12();
        boolean check = true;
        for (int i = 0; i < ch.length; i++)
        {

            if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[')
            {
                s.push(ch[i]);
            }
            else if (ch[i] == ']')
            {
                if (stack12.isEmpty() || stack12.pop() != '[')
                {
                    check = false;
                }
                }
            else if (ch[i] == ')')
            {
                if (stack12.isEmpty() || stack12.pop() != '(')
                {
                    check = false;
                }
            }
            else if (ch[i] == '}')
            {
                        if (stack12.isEmpty() || stack12.pop() != '{')
                        {
                            check = false;
                        }
                    }
                }
        return check;
        }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
       if(check(str))
           System.out.println("balanced");
       else
           System.out.println("unbalanced");
    }
}
