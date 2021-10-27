import java.util.Scanner;

public class A_Buy_a_Shovel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int priceOfShovels = scan.nextInt();
        int coinValue = scan.nextInt();
        int priceOfminimumNumberOfShovels = priceOfShovels;
        int count = 0;
        for(int i = 2;;i++){

            if(priceOfminimumNumberOfShovels % 10 == 0){
                count = i-1;
                break;
            }
            else if(((priceOfminimumNumberOfShovels - coinValue) % 10) == 0){
                count = i-1;
                break;
            }
            else{
                priceOfminimumNumberOfShovels = priceOfShovels * i;
            }
        }

        System.out.print(count);

    }
}
