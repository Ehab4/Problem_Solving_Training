import java.util.HashMap;
import java.util.Scanner;

public class A_Boy_or_Girl {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        StringBuffer username = new StringBuffer(scan.next());

        for(int i = 0;i < username.length() - 1;i++){
            for(int j = i+1;j < username.length();j++){
                if(username.charAt(i) == username.charAt(j)){
                    username = username.deleteCharAt(j);
                    j = j - 1;
                }
            }
        }
        if(username.length() % 2 == 0){
            System.out.print("CHAT WITH HER!");
        }
        else{
            System.out.print("IGNORE HIM!");
        }
    }
}
