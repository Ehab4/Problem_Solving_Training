import java.util.Scanner;

public class A_New_Password {

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        StringBuffer password = new StringBuffer();
        int count = 0;
        for (int i = 0; i < n; i++){

            password.append((char)('a' + count));
            count++;

            if(count >= k) {
                count = 0;
            }
        }

        System.out.print(password);
    }
}
