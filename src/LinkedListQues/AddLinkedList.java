package LinkedListQues;

public class AddLinkedList {
    public static boolean getBig(Node a,Node b)
    {
        boolean check=false;
        while(a!=null)
        {
            if(a.data>b.data)
            {
                check=false;
            }
            else {check=true;
                break;}
            a=a.nextRef;
            b=b.nextRef;
        }
        return check;
    }

    public static LinkedList add(LinkedList list1, LinkedList list2)
    {
      Node first=list1.head;
      Node second=list2.head;
      int carry=0,sum=0;
      int count1=0,count2=0;
      LinkedList res=new LinkedList();
         while(first!=null)
               {
            first=first.nextRef;
            count1++;
        }
        while(second!=null)
        {
            second=second.nextRef;
            count2++;
        }
        first=list1.head;
        second=list2.head;
        if(count1<count2)
        {
            Node t=first;
            first=second;
            second=t;
        }
        else if(count1==count2)
        {
            if(getBig(first,second))
            {
                Node t=first;
                first=second;
                second=t;
            }
            else
            {

            }
        }
        list1.head=first;
        list2.head=second;
list1.reverse();
list2.reverse();
first=list1.head;
second=list2.head;
        while(first!=null || second!=null) {

            if (first != null && second != null) {
                sum = carry +first.data+second.data;
                if(sum>=10)
                {
                    sum=sum-10;
                    carry=1;
                    res.insertAtStart(sum);
                }
                else
                {
                    carry=0;
                    res.insertAtStart(sum);
                }
                second=second.nextRef;
            }
            else
            {
                sum=carry+first.data;
                if(sum>=10)
                {
                    sum=sum-10;
                    carry=1;
                    res.insertAtStart(sum);
                }
                else
                {
                    carry=0;
                    res.insertAtStart(sum);
                }
            }

        first=first.nextRef;
        }
        if(carry==1)
        {
           res.insertAtStart(carry);
        }
        return res;
    }
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.insertAtLast(1);
        list1.insertAtLast(2);
        list1.insertAtLast(3);
        list2.insertAtLast(1);
        list2.insertAtLast(2);
        list2.insertAtLast(3);
        LinkedList res=add(list1,list2);
        res.show();
    }
}
