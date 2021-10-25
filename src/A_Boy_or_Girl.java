import java.util.HashMap;
import java.util.Scanner;

public class A_Boy_or_Girl {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        StringBuffer username = new StringBuffer(scan.next());

        HashMap<Character, Integer> distinctCharacters = new HashMap<Character, Integer>();

        for(int i = 0;i < username.length();i++){
            if(distinctCharacters.get(username.charAt(i)) != null) {
                distinctCharacters.put(username.charAt(i), distinctCharacters.get(username.charAt(i)) + 1);
            }
            else{
                distinctCharacters.put(username.charAt(i),1);
            }
        }

        if(distinctCharacters.size() % 2 == 0){
            System.out.print("CHAT WITH HER!");
        }
        else{
            System.out.print("IGNORE HIM!");
        }
    }
}
