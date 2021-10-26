import java.util.Scanner;

public class A_Police_Recruits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfEvents = scan.nextInt();

        int numberOfRecruitHiring = 0;
        int untreatedCrimes = 0;

        for(int i = 0;i < numberOfEvents;i++){

            int numOfCrimesAndRecruitHiring = scan.nextInt();
            if(numberOfRecruitHiring == 0 && numOfCrimesAndRecruitHiring == -1){
                untreatedCrimes++;
            }
            else if(numberOfRecruitHiring > 0 && numOfCrimesAndRecruitHiring == -1){
                numberOfRecruitHiring--;
            }
            else{
                numberOfRecruitHiring += numOfCrimesAndRecruitHiring;
            }
        }

        System.out.print(untreatedCrimes);
    }
}
