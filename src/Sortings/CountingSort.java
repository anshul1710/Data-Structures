package Sortings;
public class CountingSort
{
    public static int [] countSort(int[] arr)
    {

        return arr;
    }
    public static void main(String[] args)
    {
        int arr[]={3,6,5,3,1,3,2,5,2,0,1};
        arr= countSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
