package heap;

import java.util.Scanner;

public class HeapSort {
    public static void createHeap(int[] arr,int i)
    {
        int childIndex=i;
        int parentIndex=(childIndex-1)/2;
        while (childIndex>0)
        {
            if(arr[childIndex]>arr[parentIndex])
            {
                int temp=arr[childIndex];
                arr[childIndex]=arr[parentIndex];
                arr[parentIndex]=temp;
                childIndex=parentIndex;
                parentIndex=(childIndex-1)/2;
            }
            else
                return;
        }
    }
 public static int removeFromHeap(int[] arr, int n)
 {
     int temp=arr[0];
     arr[0]=arr[n-1];
    n--;
     int index=0;
     int left=2*index+1;
     int right=2*index+2;
     while(left<n)
     {
        int min=index;
        if(arr[left]>arr[min])
        {
            min=left;
        }
        if(arr[right]>arr[min] && right<n)
        {
            min=right;
        }
       if(min!=index)
       {
           int temp1=arr[index];
           arr[index]=arr[min];
           arr[min]=temp1;
           index=min;
           left=2*index+1;
           right=2*index+2;
       }
       else {
           break;
       }
     }
     return temp;
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /* int arr[] = new int[20];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }*/
         int[] arr= new int[]{20,43,78,84,36,45,3,2,6};
        for (int i = 0; i < arr.length; i++) {
            createHeap(arr, i);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[arr.length-1-i]=removeFromHeap(arr,arr.length-i);
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
