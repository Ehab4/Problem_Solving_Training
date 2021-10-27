import java.util.Scanner;

public class A_Games {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfTeams = scan.nextInt();

        int [][] teams = new int [numberOfTeams][2];

        for(int i = 0;i < numberOfTeams;i++){
            teams[i][0] = scan.nextInt();
            teams[i][1] = scan.nextInt();
        }

        int hostTeamInGuestUniform = 0;
        for(int i = 0;i < numberOfTeams;i++){
            for(int j = 0;j < numberOfTeams;j++){
                if(teams[i][1] == teams[j][0]){
                    hostTeamInGuestUniform++;
                }
            }
        }

        System.out.print(hostTeamInGuestUniform);

    }
}
