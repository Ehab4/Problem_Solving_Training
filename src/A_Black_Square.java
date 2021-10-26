import java.util.Scanner;

public class A_Black_Square {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int strips[] = new int [4];

        for(int i = 0;i < 4; i++){
            strips[i] = scan.nextInt();
        }
        String stripsNumber = scan.next();
        int result = 0;

        for(int i = 0; i < stripsNumber.length();i++){
            if(stripsNumber.charAt(i) == '1'){
                result += strips[0];
            }
            else if(stripsNumber.charAt(i) == '2'){
                result += strips[1];
            }else if(stripsNumber.charAt(i) == '3'){
                result += strips[2];
            }
            else{
                result += strips[3];
            }
        }

        System.out.print(result);
    }

}
