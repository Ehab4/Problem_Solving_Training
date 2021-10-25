import java.util.Scanner;

public class A_Word_Capitalization {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = new String(scan.next());

        String firstLetter = str.substring(0,1);
        String capitalFirstLetter = firstLetter.toUpperCase();
        str = str.replaceFirst(firstLetter,capitalFirstLetter);



        System.out.print(str);


    }
}
