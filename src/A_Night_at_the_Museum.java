import java.util.Scanner;

public class A_Night_at_the_Museum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        int numOfLetters = 26;
        int start = 97;
        int end = 0;
        int result = 0;
        for(int i = 0;i < str.length();i++){
            int temp = numOfLetters - (Math.abs(start - str.charAt(i)));
            if(temp < (Math.abs(start - str.charAt(i)))){
                result += temp;
            }
            else{
                result += (Math.abs(start - str.charAt(i)));
            }

            start = str.charAt(i);
        }

        System.out.println(result);
    }
    
}
