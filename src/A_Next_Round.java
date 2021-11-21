import java.util.Scanner;

public class A_Next_Round {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int count = 0;

        int [] arr = new int [n+1];


        for(int i = 1;i <= n;i++){
            arr[i] = scan.nextInt();
        }

        for(int i = 1;i<=n;i++){
            if(arr[i] >= arr[k] && arr[i] > 0){
                count++;
            }
            else{
                break;
            }
        }
        System.out.print(count);
    }
}
