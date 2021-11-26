import java.util.HashSet;
import java.util.Scanner;

public class A_I_Wanna_Be_the_Guy {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        HashSet<Integer> levels = new HashSet<Integer>();
        int p = scan.nextInt();
        for(int i = 0; i < p;i++){
            int temp = scan.nextInt();
            levels.add(temp);
        }

        int q = scan.nextInt();
        for(int i = 0;i<q;i++){
            int temp = scan.nextInt();
            levels.add(temp);
        }

        if(levels.size() == n) {
            System.out.print("I become the guy.");
        }
        else{
            System.out.print("Oh, my keyboard!");
        }
    }
}
