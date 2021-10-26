import java.util.Scanner;

public class A_Stones_on_the_Table {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfStones = scan.nextInt();

        String stonesColor = scan.next();

        int minimumStonesTakes = 0;
        for(int i = 0;i < numberOfStones - 1;i++){
            if(stonesColor.charAt(i) == stonesColor.charAt(i+1)){
                minimumStonesTakes++;
            }
        }

        System.out.print(minimumStonesTakes);

    }
}
