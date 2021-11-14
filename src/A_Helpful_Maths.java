import java.util.Scanner;

public class A_Helpful_Maths {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        String arr[] = s.split("\\+");

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int start = 0;
        StringBuffer str = new StringBuffer();
        for(int i = 0; i < arr.length; i++){
            int num = Integer.parseInt(arr[i]);
            if(num == 1){
                n1++;
                start = num;
            }
            else if(num == 2){
                n2++;
                start = num;
            }
            else{
                n3++;
                start = num;
            }
        }
        int len = n1+n2+n3;
        for (int i = 0; i < len; i++) {
            if (len > 1) {
                if (n1 != 0) {
                    str.append(1);
                    n1--;
                }
                else if (n2 != 0) {
                    str.append(2);
                    n2--;
                }
                else if (n3 != 0) {
                    str.append(3);
                    n3--;
                }

                if (i != arr.length - 1) {
                    str.append("+");
                }
            }
            else{
                str.append(start);
            }
        }

        System.out.println(str);
    }

}
