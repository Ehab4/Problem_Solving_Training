import java.util.Scanner;

public class A_Olesya_and_Rodion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int t = scan.nextInt();

        StringBuffer n2 = new StringBuffer();

        if(n == 1){
            if(t == 10){
                System.out.print(-1);
            }else{
                System.out.print(t);
            }
        }else{
            if(t == 10){
                n2.append(10);
                for(int i = 0;i < n - 2;i++){
                    n2.append(0);
                }
                System.out.print(n2);
            }else{
                n2.append(t);
                for(int i = 0;i < n - 1;i++){
                    n2.append(0);
                }
                System.out.print(n2);
            }
        }
    }
}
