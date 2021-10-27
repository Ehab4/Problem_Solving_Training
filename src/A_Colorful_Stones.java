import java.util.Scanner;

public class A_Colorful_Stones {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        String instruction = scan.next();
        int count = 1;
        int j = 0;
        for(int i = 0;i < instruction.length();i++){
            if(str.charAt(j) == instruction.charAt(i)){
                j++;
                count++;
            }
        }

        System.out.print(count);
    }

}
