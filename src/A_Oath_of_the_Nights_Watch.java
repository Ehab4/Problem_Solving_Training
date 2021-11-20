import java.util.Scanner;

public class A_Oath_of_the_Nights_Watch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int [n];
        arr[0] = scan.nextInt();
        int min = arr[0];
        int max = arr[0];
        int count = 0;
        for(int i = 1;i < n;i++){
            arr[i] = scan.nextInt();
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for (int i = 0;i < n;i++){
            if(arr[i] > min && arr[i] < max){
                count++;
            }
        }
        System.out.print(count);
    }
}
