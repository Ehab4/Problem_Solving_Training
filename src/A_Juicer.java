import java.util.Scanner;

public class A_Juicer {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int b = scan.nextInt();
        int d = scan.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0;i < n;i++){
            int a = scan.nextInt();
            if(a <= b){
                sum+=a;
            }
            if(sum > d){
                sum = 0;
                count++;
            }

        }
        System.out.print(count);
    }
    
}
