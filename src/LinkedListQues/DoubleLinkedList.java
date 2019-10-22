package LinkedListQues;

import java.sql.SQLOutput;

public class DoubleLinkedList {
    DoubleNode head=null;
    DoubleNode tail=null;
    int count=(-1);
    public void insetAtLast(int data)
    {
        DoubleNode n=new DoubleNode();
        n.data=data;
        n.next=null;
        n.prev=null;
        if(head==null)
        {
            head=n;
            tail=null;
        }
        else if(head!=null && tail==null)
        {
            tail=n;
            tail.prev=head;
            head.next=tail;

        }
        else
        {
        DoubleNode temp=tail;
        tail=n;
        tail.prev=temp;
        temp.next=tail;

        }
count++;    }
    public void insertAtFIrst(int data)
    {
        DoubleNode n=new DoubleNode();
        n.data=data;
        n.next=null;
        n.prev=null;
        if(head==null)
        {
            head=n;
            tail=null;
        }
        else if(head!=null && tail==null)
        {
            tail=head;
            head=n;
            n.next=tail;
            tail.prev=n;
        }
        else
        {
            n.next = head;
            head = n;
        }
count++;
    }
    public void deleteAtLast()
    {
        if(head==null)
        {
            System.out.println("error");
        }
        else if(head!=null && tail==null)
        {
            head=null;
        }
        else
        {
            DoubleNode temp=tail.prev;
            temp.next=null;
            tail=temp;
        }
count--;
    }
    public void deleteWithValue(int value) {
        DoubleNode n = head;
        DoubleNode temp = null;
        while (n.data != value) {
        temp=n;
        n=n.next;
        }
temp.next=n.next;
        DoubleNode temp2=n.next;
        temp2.prev=n.prev;


    }
   public void deleteAtFirst()
   {
       if(head==null)
       {
           System.out.println("error");
       }
       else if(head!=null && tail==null)
       {
           head=null;
       }
       else
       {
          head=head.next;
          head.prev=null;
       }
       count--;
   }
   public void insertAt(int index,int data)
   {
       DoubleNode n=new DoubleNode();
       n.data=data;
       n.next=null;
       n.prev=null;
  if(index==0)
  {
      deleteAtFirst();
  }
  else if(index>=count+1)
  {
      deleteAtLast();
  }
  else if(index>count+1)
  {
      System.out.println("error");
  }
  else
      {
      if((count)/2>=index) {
          DoubleNode temp = head;
          while (index > 1) {
              temp = temp.next;
              index--;
          }
        n.next=temp.next;
          temp.next=n;
          n.prev=temp;

      }
      else
      {
          DoubleNode temp = tail;
          while ((count-index) > (-1)) {
              temp = temp.prev;
              index++;
          }
          n.next=temp.next;
          temp.next=n;
          n.prev=temp;
      }
  }
   }
    public void show() {
        //System.out.println("resultant linkedlist is");
        if (head == null) {
            System.out.println("empty");
        } else {
            DoubleNode node = head;
            while (node.next != null) {
                System.out.println(node.data);
                node = node.next;
            }
            System.out.println(node.data);
        }
    }

}
