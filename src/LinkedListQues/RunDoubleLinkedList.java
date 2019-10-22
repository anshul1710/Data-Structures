package LinkedListQues;

import java.util.Scanner;

public class RunDoubleLinkedList {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
      /*  dll.insetAtLast(2);
        dll.insetAtLast(3);
        dll.insetAtLast(5);
        dll.insetAtLast(6);
        dll.insetAtLast(7);
        dll.insetAtLast(8);

        dll.insertAtFIrst(1);
        dll.insertAtFIrst(4);
        //dll.show();
        dll.deleteAtLast();

        dll.deleteAtFirst();
        dll.insertAt(5,10);
        //System.out.println(dll.count);
        dll.show();*/
        Scanner sc = new Scanner(System.in);
        char temp='m';
        int temp1, ind;
        System.out.println("type a to insert at beginning");
        System.out.println("type b to insert at last");
        System.out.println("type c to insert at index");
        System.out.println("type d to delete from start");
        System.out.println("type f to delete from last");
        System.out.println("type g to delete from value");
        System.out.println("type e to exit");
        while (temp != 'e') {
            temp = sc.next().charAt(0);
            switch (temp) {
                case 'a':
                    System.out.println("enter value");
                    temp1 = sc.nextInt();
                    dll.insertAtFIrst(temp1);
                    break;
                case 'b':
                    System.out.println("enter value");
                    temp1 = sc.nextInt();
                    dll.insetAtLast(temp1);
                    break;
                case 'c':
                    System.out.println("enter index");
                    ind = sc.nextInt();
                    System.out.println("enter value");
                    temp1 = sc.nextInt();
                    dll.insertAt(ind, temp1);
                    break;
                case 'd':
                    dll.deleteAtFirst();
                    break;
                case 'f':
                    dll.deleteAtLast();
                    break;
                case 'g':
                    temp1=sc.nextInt();
                    dll.deleteWithValue(temp1);
                case 'e':
                    break;
            }

        }
        dll.show();
    }
}
