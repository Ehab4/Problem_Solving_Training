import java.util.Scanner;

public class A_Even_Odds {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong();
        long k = scan.nextLong();

        long index = 0;

        if(n % 2 == 0) {
            if (k <= Math.floor(n / 2)) {
                System.out.print(2 * k - 1);
            } else {
                index = 2 * (k - (long) Math.floor(n / 2));
                System.out.print(index);
            }
        }else{
            if (k <= Math.floor(n / 2) + 1) {
                System.out.print(2 * k - 1);
            } else {
                index = 2 * (k - (long) Math.floor((n+1) / 2));
                System.out.print(index);
            }
        }
    }
}
