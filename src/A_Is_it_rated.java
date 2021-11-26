import java.util.Scanner;

public class A_Is_it_rated {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int [] p = new int [n];

        boolean rated = false;
        boolean maybeRated = false;
        for(int i = 0;i < n;i++){
            int r1 = scan.nextInt();
            int r2 = scan.nextInt();

            if(r1 != r2){
                rated = true;
            }
            p[i] = r1;
        }

        for(int i = 1;i < n;i++){
            if(p[i - 1] < p[i]){
                maybeRated = true;
            }
        }

        if(rated){
            System.out.print("rated");
        }else if(maybeRated){
            System.out.print("unrated");
        }else{
            System.out.print("maybe");
        }
    }
}
