import java.util.Scanner;

public class A_Keyboard {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl;";
        String s3 = "zxcvbnm,./";

        char shift = scan.next().charAt(0);

        String s = scan.next();
        StringBuffer str = new StringBuffer();
        for(int i = 0; i < s.length(); i++){

                int x1 = s1.indexOf(s.charAt(i));
                int x2 = s2.indexOf(s.charAt(i));
                int x3 = s3.indexOf(s.charAt(i));

                if(shift == 'L') {
                    if (x1 != -1) {
                        str.append(s1.charAt(x1 + 1));
                    } else if (x2 != -1) {
                        str.append(s2.charAt(x2 + 1));
                    } else {
                        str.append(s3.charAt(x3 + 1));
                    }
                }else{
                    if (x1 != -1) {
                        str.append(s1.charAt(x1 - 1));
                    } else if (x2 != -1) {
                        str.append(s2.charAt(x2 - 1));
                    } else {
                        str.append(s3.charAt(x3 - 1));
                    }
                }
            }

        System.out.print(str);
        }

    }

