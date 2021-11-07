import java.util.Scanner;

public class A_Shaass_and_Oskols {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int birds [] = new int[n];

        for(int i = 0;i < n;i++){
            birds[i] = scan.nextInt();
        }
        int m = scan.nextInt();

        for (int i = 0;i < m;i++){
            int x  = scan.nextInt();
            int y  = scan.nextInt();

            if(n == 1){
                birds[x-1] = 0;
            }
            else if(x == 1){
                birds[x] += Math.abs(birds[x-1] - y);
                birds[x - 1] = 0;
            }
            else if(x > 1 && x < n){
                birds[x] += Math.abs(birds[x-1] - y);
                birds[x - 2] += Math.abs(y - 1);
                birds[x-1] = 0;
            }
            else{
                birds[x - 2] += Math.abs(y -1);
                birds[x-1] = 0;
            }
        }
        for (int i = 0;i < n;i++){
            System.out.println(birds[i]);
        }

    }


}
