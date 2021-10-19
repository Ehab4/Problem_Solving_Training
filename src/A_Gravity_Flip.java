import java.util.Scanner;

public class A_Gravity_Flip {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfColumns = 0;
        numberOfColumns = scan.nextInt();

        int [] numberOfCubes = new int[numberOfColumns];

        for(int i = 0;i < numberOfColumns;i++){
            numberOfCubes[i] = scan.nextInt();
        }

        for(int i = 0;i < numberOfColumns;i++){
            for(int j = 0;j < numberOfColumns - i - 1;j++){
                if(numberOfCubes[j] > numberOfCubes[j+1]){
                    int temp = numberOfCubes[j+1];
                    numberOfCubes[j+1] = numberOfCubes[j];
                    numberOfCubes[j] = temp;
                }
            }
        }
        for(int i = 0;i<numberOfColumns;i++) {
            System.out.println(numberOfCubes[i] + " ");
        }
    }
}
