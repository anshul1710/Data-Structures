package Sortings;
import java.util.*;
public class BucketSort
{
    public static int[] bucketSort(int arr[]) {
        int b[][] = new int[10][10];
        int mx = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > mx) {
            }
            mx = arr[i];
        }
        for (int exp = 1; mx/exp > 0; exp *= 10)
        {

        }
        return arr;
    }
    public static void main(String[] args)
    {
        int arr[]={10,2,5,1,6,9,7};
       arr= bucketSort(arr);
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }
    }
}
