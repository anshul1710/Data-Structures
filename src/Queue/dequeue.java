package Queue;

public class dequeue {
    int front,rear;
    int capacity;
    int arr[]=new int[100];
    dequeue(int capacity)
    {
        this.capacity=capacity;
        arr = new int[capacity];
        front=(-1);
        rear=(-1);
    }
    boolean isEmpty()
    {
        if(front==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isFull()
    {
        if((rear+1)%capacity==front)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void insertback(int value)
    {
        if(isFull())
        {
            System.out.println("full");
        }
        else
        {
            rear=(rear+1)%capacity;
            arr[rear]=value;
            if(front==(-1))
            {
                front=rear;
            }
        }
    }
    void deleteFront()
    {
        if (isEmpty())
        {
            System.out.println("empty");
        }
        else
        {
            if(front==rear)
            {
                front=-1;
                rear=-1;
            }
            else
            {
                front= (front+1)%capacity;
            }
        }
    }
    void insertFront(int value)
    {
        if(isFull())
        {
            System.out.println("full");
        }
        else
        {
          if(front==(-1))
          {
              front=0;
              rear=0;
              arr[front]=value;
          }
          else if(front==0)
          {
              front=capacity-1;
              arr[front]=value;
          }
          else
          {
              front--;
              arr[front]=value;
          }
        }
    }
    void deleteLast()
    {
        if(isEmpty())
        {
            System.out.println("empty");
        }
        else
        {
  if(front==rear)
  {
      front=-1;
      rear=-1;
  }
  else if(rear==0)
  {
      rear=capacity-1;
  }
  else
  {
      rear=rear-1;
  }
        }
    }
    public static void main(String[] args)
    {
        dequeue dequeue=new dequeue(10);
        dequeue.insertback(3);
        dequeue.insertback(4);
        dequeue.insertFront(5);
   /*  dequeue.insertFront(6);
     dequeue.insertFront(7);
     dequeue.insertFront(8);
     dequeue.insertFront(10);
     dequeue.insertFront(11);
     dequeue.insertFront(12);
     dequeue.insertFront(13);*/
   dequeue.deleteFront();
   dequeue.deleteFront();
   dequeue.deleteFront();
   dequeue.deleteFront();
    }
}
