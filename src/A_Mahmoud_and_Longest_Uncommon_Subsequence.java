import java.util.Scanner;

public class A_Mahmoud_and_Longest_Uncommon_Subsequence {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();

        if(a.equals(b)){
            System.out.print("-1");
        }
        else if(a.length() > b.length()){
            System.out.print(a.length());
        }
        else{
            System.out.print(b.length());
        }
    }
}
