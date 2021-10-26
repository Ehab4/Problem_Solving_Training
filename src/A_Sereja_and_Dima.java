import java.util.Scanner;

public class A_Sereja_and_Dima {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfCards = scan.nextInt();

        int cards[] = new int[numberOfCards];

        for (int i = 0; i < numberOfCards; i++) {
            cards[i] = scan.nextInt();
        }
        int sumOfFirstPlayerCards = 0;
        int sumOfSecondPlayerCards = 0;
        int i = 0;
        int j = numberOfCards - 1;
        boolean nextTurn = true;
        while (i <= j) {
            if (nextTurn) {
                if (cards[i] >= cards[j]) {
                    sumOfFirstPlayerCards += cards[i];
                    i++;
                } else {
                    sumOfFirstPlayerCards += cards[j];
                    j--;
                }
                nextTurn = false;
            } else {
                if (cards[i] >= cards[j]) {
                    sumOfSecondPlayerCards += cards[i];
                    i++;
                } else {
                    sumOfSecondPlayerCards += cards[j];
                    j--;
                }
                nextTurn = true;
            }

        }
        System.out.println(sumOfFirstPlayerCards + " " + sumOfSecondPlayerCards);
    }

}
