import java.util.Scanner;

public class A_Word {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String username = new String(scan.next());
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        for(int i = 0;i < username.length();i++){
            if(username.charAt(i) >= 65 && username.charAt(i) <= 90){
                uppercaseCount++;
            }
            else{
                lowercaseCount++;
            }
        }

        if(uppercaseCount > lowercaseCount){
            System.out.print(username.toUpperCase());
        }
        else{
            System.out.print(username.toLowerCase());
        }
    }
}
