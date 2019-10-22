import java.util.*;

public class linaerSearch {
    private static int[] bubble(int[] a)
    {
        int temp;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
     return a;
    }
public static void main(String[] args)
{
    Scanner s1=new Scanner(System.in);
   int n=s1.nextInt();
    int[] arr = new int[n];
   for(int i=0;i<n;i++)
   {
       arr[i]=s1.nextInt();
   }
   bubble(arr);
    for(int i=0;i<n;i++)
   {
       System.out.println(arr[i]);

   }
    char c='1';
    boolean ch=Character.isDigit(c);
    System.out.println(ch);
    System.out.println(c);
}
}
