import java.util.Scanner;

public class A_Free_Ice_Cream {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int x = scan.nextInt();
        long sum = x;
        int count = 0;
        for(int i = 0; i < n; i++){
            char sign = scan.next().charAt(0);
            long d = scan.nextInt();

            if(sign == '+'){
                sum += d;
            }
            else{
                if(d <= sum){
                    sum -= d;
                }
                else{
                    count++;
                }
            }
        }

        System.out.print(sum + " " + count);

    }
}
