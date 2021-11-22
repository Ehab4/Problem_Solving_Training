import java.util.Arrays;
import java.util.Scanner;

public class A_Twins {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int [] coins = new int[n];
        int sumOfCoins = 0;
        int minCoins = 0;
        for(int i = 0;i < n;i++){
            coins[i] = scan.nextInt();
            sumOfCoins += coins[i];
        }
        Arrays.sort(coins);

        for(int i = n - 1;i >= 0;i--){
            minCoins += coins[i];
            sumOfCoins -= coins[i];
            if(minCoins > sumOfCoins){
                System.out.print(n - i);
                break;
            }
        }
    }
}
