import java.util.Scanner;

public class A_Lineland_Mail {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] cites = new int[n];

        for (int i = 0; i < n; i++) {
            cites[i] = scan.nextInt();
        }


        for (int i = 0; i < n; i++) {
            int min = 0;
            int max1 = 0;
            int max2 = 0;

            if (i == 0) {
                min = Math.abs(cites[i] - cites[i + 1]);
            } else if (i == n - 1) {
                min = Math.abs(cites[i] - cites[i - 1]);
            } else {
                if (Math.abs(cites[i] - cites[i - 1]) < Math.abs(cites[i] - cites[i + 1])) {
                    min = Math.abs(cites[i] - cites[i - 1]);
                } else {
                    min = Math.abs(cites[i] - cites[i + 1]);
                }
            }

            max1 += Math.abs(cites[i] - cites[n - 1]);

            max2 += Math.abs(cites[i] - cites[0]);

            if (max1 > max2) {
                System.out.println(min + " " + max1);
            } else {
                System.out.println(min + " " + max2);
            }
        }

    }
}
