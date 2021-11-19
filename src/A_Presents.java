import java.util.Scanner;

public class A_Presents{

    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n+1];


        for (int i = 1; i <= n; i++) {
            arr[scan.nextInt()] = i;
        }

        for (int i = 1;i<=n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
