package Sortings;

public class QuickSort {
    public static int partition(int[]arr,int low,int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {

            if (arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static void quick(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int p=partition(arr,low,high);
            quick(arr,low,p-1);
            quick(arr,p+1,high);
        }
    }
    public static int[] sort(int [] arr)
    {
        int low=0;
        int high=arr.length-1;
        quick(arr,low,high);
        return arr;
    }
public static void main(String[] args)
{
    int arr[]={10,20,70,50,90,60,80};
    arr=sort(arr);
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]+" ");
    }
}
}
