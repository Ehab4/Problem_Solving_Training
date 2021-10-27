import java.util.HashSet;
import java.util.Scanner;

public class A_Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int minimumNumberOfHorseshoes = 0;
        int colorsOfHorseshoes = 0;
        HashSet<Integer> horseshoes = new HashSet();
        for(int i = 0;i < 4;i++){
            colorsOfHorseshoes = scan.nextInt();

            if(horseshoes.contains(colorsOfHorseshoes)){
                minimumNumberOfHorseshoes++;
            }
            else{
                horseshoes.add(colorsOfHorseshoes);
            }
        }
        System.out.print(minimumNumberOfHorseshoes);
    }
}
