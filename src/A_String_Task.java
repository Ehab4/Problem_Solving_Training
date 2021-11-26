import java.util.Scanner;

public class A_String_Task {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        s = s.toLowerCase();
        StringBuffer str = new StringBuffer();

        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) != 'A' && s.charAt(i) != 'a' && s.charAt(i) != 'O' && s.charAt(i) != 'o'
            && s.charAt(i) != 'Y' && s.charAt(i) != 'y' && s.charAt(i) != 'E' && s.charAt(i) != 'e'
            && s.charAt(i) != 'U' && s.charAt(i) != 'u' && s.charAt(i) != 'I' && s.charAt(i) != 'i'){

                str.append(".");
                str.append(s.charAt(i));

            }
        }

        System.out.print(str);
    }
}
