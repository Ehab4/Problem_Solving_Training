import java.util.ArrayList;
import java.util.Scanner;

public class A_Snacktower {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int []arr = new int[num+1];
        boolean []has = new boolean[num+1];
        int next = num;
        for(int i = 1;i<=num;i++){
            arr[i] = scan.nextInt();
        }

        for(int i = 1;i <= num; i++){
            has[arr[i]] = true;

            while(has[next] && next > 0){
                System.out.print(next + " ");
                next--;
            }
            System.out.println();
        }
    }
}
