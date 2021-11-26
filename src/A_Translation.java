import java.util.Scanner;

public class A_Translation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        String t = scan.next();

        boolean isEqual = true;

        if(s.length() == t.length()) {
            int j = s.length() - 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != t.charAt(j)) {
                    isEqual = false;
                    break;
                }
                j--;
            }

            if(isEqual){
                System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }
        }
        else{
            System.out.print("NO");
        }

    }
}
