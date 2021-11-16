import java.util.HashMap;
import java.util.Scanner;

public class A_Team_Olympiad {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int prog[] = new int [num];
        int math[] = new int [num];
        int sport[] = new int [num];

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        for(int i = 1; i <= num; i++){
            int n = scan.nextInt();
            if(n == 1){
                prog[n1] = i;
                n1++;
            }
            else if(n == 2){
                math[n2] = i;
                n2++;
            }
            else{
                sport[n3] = i;
                n3++;
            }
        }

        int count = 0;
        String s = "";
        for(int i = 0; i < (int)Math.floor(num/3); i++){
            if(prog[i] != 0 && math[i] != 0 && sport[i] != 0){
                count++;
                s += prog[i] +" "+math[i]+" "+sport[i]+"\n";
            }
        }

        System.out.print(count + "\n" + s);
    }
}
