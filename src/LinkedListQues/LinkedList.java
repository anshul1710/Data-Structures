package LinkedListQues;

import java.util.HashSet;

public class LinkedList {
    Node head;

    public void insertAtLast(int data) {
        Node node = new Node();
        node.data = data;
        node.nextRef = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.nextRef != null) {
                n = n.nextRef;
            }
            n.nextRef = node;
        }
    }

    public void insertAtStart(int data) {

        Node node = new Node();
        node.data = data;
        node.nextRef = null;
        if (head == null) {
            head = node;
        } else {
            node.nextRef = head;
            head = node;
        }
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.nextRef = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            if (index == 0) {
                insertAtStart(data);
            } else {
                while (index > 1) {
                    n = n.nextRef;
                    index--;
                }
                node.nextRef = n.nextRef;
                n.nextRef = node;
            }
        }
    }

    public void deleteStart() {
        if(head==null)
        {
            System.out.println("cannot pop or delete because empty");
        }
        else
            {
            Node n = head;
            head = head.nextRef;
        }
    }

    public void deleteWithIndex(int index) {
        Node n = head;
        if (index == 0) {
            deleteStart();
        } else {
            while (index > 1) {
                n = n.nextRef;
                index--;
            }
            Node ntemp = null;
            ntemp = n.nextRef;
            n.nextRef = ntemp.nextRef;

        }
    }

    public void deleteLast() {
        Node n = head;
        Node temp = null;
        while (n.nextRef != null) {
            temp = n;
            n = n.nextRef;
        }
        temp.nextRef = null;
    }

    public void deleteWithValue(int value) {
        Node n = head;
        Node temp = null;
        while (n.data != value) {
            temp = n;
            n = n.nextRef;
        }

        temp.nextRef = n.nextRef;

    }
   public void removeDuplicates()
   {
       /*
       //for serted
       Node n=head;
       while(n.nextRef!=null)
       {
           Node temp=n;
           while(temp!=null && temp.data==n.data)
           {
               temp=temp.nextRef;
           }
           n.nextRef=temp;
               n=n.nextRef;
       }*/
       HashSet<Integer> hs = new HashSet<>();
       Node current = head;
       Node prev = null;
       while (current != null)
       {
           int curval = current.data;
           if (hs.contains(curval)) {
               prev.nextRef = current.nextRef;
           } else {
               hs.add(curval);
               prev = current;
           }
           current = current.nextRef;
       }

   }

    public void show() {
        //System.out.println("resultant linkedlist is");
        if (head == null) {
            System.out.println("empty");
        } else {
            Node node = head;
            while (node.nextRef != null) {
                System.out.println(node.data);
                node = node.nextRef;
            }
            System.out.println(node.data);
        }
    }
    public void reverse() {
        Node temp = head;
        Node p = null, n = null;
        while (temp != null) {
            n = temp.nextRef;
            temp.nextRef = p;
            p = temp;
            temp = n;
        }
        head = p;
    }

    public void checkpalidrome(LinkedList list) {
        int t = 0;
        Node n = list.head;
        while (n != null) {
            n = n.nextRef;
            t++;
        }
        LinkedList revlist = new LinkedList();
        Node itemp = list.head;
        while (itemp != null) {
            revlist.insertAtLast(itemp.data);
            itemp = itemp.nextRef;
        }
        revlist.reverse();

        Node n1 = list.head;
        Node revN = revlist.head;

        while (n1.nextRef != null && revN.nextRef != null) {
            if (n1.data == revN.data) {
                t--;
            }
            n1 = n1.nextRef;
            revN = revN.nextRef;
        }

        if (n1.data == revN.data) {
            t--;
        }
        if (t == 0) {
            System.out.println("pallidrome");
        } else {
            System.out.println("not a pallidrome");
        }

    }

    // for StackWithLinkedLast
    public void push(int data)
    {
        insertAtLast(data);
    }
    public void pop()
    {

        deleteStart();
    }
}

