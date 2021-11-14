import java.util.Scanner;

public class A_Carrot_Cakes {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int t = scan.nextInt();
        int k = scan.nextInt();
        int d = scan.nextInt();

        int g = (n+k-1)/k;
        int t1 = 0;
        int t2 = d;

        for(int i = 0;i<g;i++){
            if(t1<=t2){
                t1+=t;
            }
            else{
                t2+=t;
            }
        }
        if(Math.max(t1,t2)<g*t){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }

}
