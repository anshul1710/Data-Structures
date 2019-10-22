package Queue;

public class ArrayQueue {
    int front,rear;
    int capacity;
    int arr[]=new int[100];
    ArrayQueue(int capacity)
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
    int size()
    {
        return ((capacity-front)+(rear+1) % capacity);
    }
    void insert(int value)
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
    void delete()
    {
        if (isEmpty())
        {
            System.out.println("empty");
        }
        else
        {
            if(front==rear)
            {
                front=0;
                rear=0;
            }
            else
            {
                front= (front+1)%capacity;
            }
        }
    }
}
