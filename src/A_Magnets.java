import java.util.Scanner;

public class A_Magnets {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfMagnets = scan.nextInt();
        int magnets[] = new int[numberOfMagnets];

        for (int i = 0; i < numberOfMagnets; i++) {
            magnets[i] = scan.nextInt();
        }

        int count10 = 0;
        int count01 = 0;
        int countGroupsOfMagnets = 0;
        for (int i = 0; i < numberOfMagnets; i++) {
            if (magnets[i] == 10) {

                if (count10 == 0) {
                    count01 = 0;
                    countGroupsOfMagnets += 1;
                }
                count10 += 1;
            } else {
                if (count01 == 0) {
                    count10 = 0;
                    countGroupsOfMagnets += 1;
                }
                count01 += 1;
            }
        }

        System.out.println(countGroupsOfMagnets);

    }
}
