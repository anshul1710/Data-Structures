package LinkedListQues;
import java.util.HashSet;
import java.util.Scanner;

    public class RunLinkedList {

        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            Scanner sc = new Scanner(System.in);
            char temp = 'z';
            int temp1, ind;
            System.out.println("type a to insert at beginning");
            System.out.println("type b to insert at last");
            System.out.println("type c to insert at index");
            System.out.println("type d to delete from start");
            System.out.println("type f to delete from last");
            System.out.println("type g to delete of specific value");
            System.out.println("type h to delete of specific index");
            System.out.println("type e to exit");
            while (temp != 'e') {
                temp = sc.next().charAt(0);
                switch (temp) {
                    case 'a':
                        System.out.println("enter value");
                        temp1 = sc.nextInt();
                        list.insertAtStart(temp1);
                        break;
                    case 'b':
                        System.out.println("enter value");
                        temp1 = sc.nextInt();
                        list.insertAtLast(temp1);
                        break;
                    case 'c':
                        System.out.println("enter index");
                        ind = sc.nextInt();
                        System.out.println("enter value");
                        temp1 = sc.nextInt();
                        list.insertAt(ind, temp1);
                        break;
                    case 'd':
                        list.deleteStart();
                        break;
                    case 'f':
                        list.deleteLast();
                        break;
                    case 'g':
                        System.out.println("enter value");
                        temp1 = sc.nextInt();
                        list.deleteWithValue(temp1);
                        break;
                    case 'h':
                        System.out.println("enter index");
                        ind = sc.nextInt();
                        list.deleteWithIndex(ind);
                        break;
                    case 'i':
                        list.removeDuplicates();
                        break;
                    case 'e':
                        break;
                }
            }

            list.show();
            //list.reverse();
            //list.show();
            list.checkpalidrome(list);
        /*
         list.insertAtLast(5);
        list.insertAtLast(4);
        list.insertAtLast(7);
        list.insertAtStart(2);
        list.insertAt(2,20);
        list.deleteStart();
        //list.deleteWithIndex(1);
        //list.deleteLast();
        list.deleteWithValue(4);
        list.show();

        */

        }
    }

