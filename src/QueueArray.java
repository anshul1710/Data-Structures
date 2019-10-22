
class Queue <E> {

    private int size = 10;
    private E []arr;
    private int rear = -1, front = -1;


    Queue() {
        this.arr = (E[])new Object[size];

    }

    Queue(int size) {
        this.size = size;
        this.arr = (E[]) new Object[size];

    }


    public void add(E element)
    {
        if(!overflow())
        {
            rear++;
            arr[rear]=element;
        }
        else {
            System.out.println("queue is full");
        }
    }
    public boolean overflow()
    {
        if(rear>size)
        {
            return true;
        }
        else
            return false;
    }
    public void del()
    {

        if(!underflow())
        {
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }


            if (rear > size)


                arr[rear] = (E)"";
            rear--;

        }

        else
        {
            System.out.println("queue is empty");
        }
    }
    public boolean underflow()
    {
        if(rear==(-1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void print()
    {
        for(int i=front;i<rear+1;i++)
        System.out.println(arr[i]);
    }
}
public class QueueArray {

    public static void main(String[] args) {

        Queue<Integer> q = new Queue<>(5);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        q.del();
        q.del();
        q.del();
        q.del();
        q.del();
        q.del();
        q.print();
    }
}

