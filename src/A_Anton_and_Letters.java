import java.util.HashSet;
import java.util.Scanner;

public class A_Anton_and_Letters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        HashSet<Character> distinctLetters = new HashSet<Character>();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                distinctLetters.add(str.charAt(i));
            }
        }

        System.out.print(distinctLetters.size());
    }


}
