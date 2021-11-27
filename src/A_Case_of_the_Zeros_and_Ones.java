import java.util.Scanner;

public class A_Case_of_the_Zeros_and_Ones {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        String s = scan.next();
        int countZeros = 0;
        int countOnes = 0;
        for(int i = 0;i < n;i++){
            if(s.charAt(i) == '1'){
                countOnes += 1;
            }else{
                countZeros += 1;
            }
        }

        System.out.print(Math.abs(countOnes - countZeros));
    }
}
