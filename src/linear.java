import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s1.nextInt();
        }
     int k=s1.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
