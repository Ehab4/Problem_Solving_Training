import java.util.Scanner;

public class A_Helpful_Maths {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        String arr[] = s.split("\\+");
        int numbers[] = new int [arr.length];
        for(int i = 0;i<numbers.length;i++){
            numbers[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length - 1; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++){
            if(numbers.length > 1) {
                System.out.print(numbers[i]);
                if(i != numbers.length-1) {
                    System.out.print("+");
                }
            }
            else{
                System.out.print(numbers[i]);
            }
        }
    }

}
