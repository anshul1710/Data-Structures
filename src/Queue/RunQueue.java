package Queue;

public class RunQueue {
public static void main(String[] args)
{
    ArrayQueue q=new ArrayQueue(5);
    q.insert(4);
    q.insert(5);
    System.out.println(q.size());
    q.insert(6);
    q.delete();
    q.insert(7);
    q.insert(8);
    q.insert(9);
    q.delete();
    q.insert(10);
}
}
