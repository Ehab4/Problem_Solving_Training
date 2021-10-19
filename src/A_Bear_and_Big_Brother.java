import java.util.Scanner;

public class A_Bear_and_Big_Brother {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int weightOfLimak = scan.nextInt();
        int weightOfBob = scan.nextInt();
        int yearsCount = 0;
        for(int i = 1;weightOfBob >= weightOfLimak;i++){
            weightOfBob *= 2;
            weightOfLimak *= 3;
            yearsCount = i;
        }

        System.out.println(yearsCount);
    }
}
