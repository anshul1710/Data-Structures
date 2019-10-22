import java.util.*;
public class Binary {
    private static int binarySort(int[] a, int val, int l, int h)
    {
        int mid=(l+h)/2;
        if(val==a[mid])
        {
            return mid;
        }
       else if(a[mid]>val)
        {
            l=0;
            h=mid-1;
            return binarySort(a,val,l,h);
        }
       else if(a[mid]<val)
        {
            l=mid+1;
            h=a.length-1;
            return binarySort(a,val,l,h);
        }
       else
           {
            return -1;
        }
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
        int val=s1.nextInt();
        int l=0;
        int h=arr.length-1;
        Arrays.sort(arr);
        int a=binarySort(arr,val,l,h);
        System.out.println(a);
    }
}
