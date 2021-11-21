import java.util.Scanner;

public class A_Pangram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String s = scan.next();

        s = s.toLowerCase();
        boolean [] pangram = new boolean [26];

        for(int i = 0; i < n; i++){
            pangram [122 - s.charAt(i)] = true;
        }

        boolean isPangram = true;
        for(int i = 0;i < 26; i++){
            if(!pangram[i]){
                isPangram = false;
            }
        }

        if(isPangram){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}
