import java.util.Scanner;

public class A_Bit_plus_plus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int x = 0;

        for(int i = 0; i < n ; i++){
            String operation = scan.next();

            if(operation.equals("X++") || operation.equals("++X")){
                x++;
            }
            else{
                x--;
            }
        }

        System.out.print(x);
    }
}
