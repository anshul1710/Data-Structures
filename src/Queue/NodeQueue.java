package Queue;

import LinkedListQues.Node;

public class NodeQueue {
    public Node front;
    Node rear;


    public void insert(int value)
    {
        Node n=new Node();
        n.data=value;
        if(front==null)
        {
          front=n;
        }
        else
        {
        rear.nextRef=n;
        }
        rear=n;
        rear.nextRef=front;
    }
    public void delete()
    {
        if(front==null)
        {
            System.out.println("queue empty");
        }
        else if(front==rear)
        {
            front=null;
            rear=null;
        }
        else
        {
            front=front.nextRef;
            rear.nextRef=front;
        }
    }
    void display()
    {
        Node temp=front;
        while(temp.nextRef!=front)
        {
            System.out.println(temp.data);
            temp=temp.nextRef;
        }
        System.out.println(temp.data);
    }

    public boolean isEmpty()
    {
        if(front==null && rear==null)
        return true;
        else
            return false;
    }


}
