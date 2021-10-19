import java.util.Scanner;

public class A_Team {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int numberOfProblems = scan.nextInt();

        int solvedProblems = 0;

        for (int i = 0; i < numberOfProblems; i++) {

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if ((a + b + c) > 1) {
                solvedProblems += 1;
            }
        }
        System.out.println(solvedProblems);
    }
}

