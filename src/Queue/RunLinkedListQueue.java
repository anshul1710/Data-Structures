package Queue;

public class RunLinkedListQueue {
    public static void main(String[] args)
    {
        NodeQueue q =new NodeQueue();
        q.insert(22);
        q.insert(33);
        q.insert(44);
        q.delete();
        q.display();
    }
}
