package RPS;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        game(0,0,0);
    }

    public static void game(int playerScore, int computerScore, int totalGames) {
        System.out.println("scores = p- " + playerScore + " c- " + computerScore);
        if (playerScore < 5 && computerScore < 5) {

            Scanner sc = new Scanner(System.in); //used for user input
            System.out.println("select choice");

            char in = sc.next().charAt(0); //gets first character of user input(  computer waits and return after you input

            char choices[] = {'r', 'p', 's'};

            Random random = new Random();//creates random object to gen a random number

            char c = choices[random.nextInt(2)];//random number between 0 and 2 used to select index of choices[] (r,p,s)

            System.out.println("player chooses " + in);
            System.out.println("computer chooses " + c);

            if (in == c) {
                System.out.println("draw");
                game(playerScore, computerScore,totalGames+1);
            } else if (in == 'r' && c == 's') {
                System.out.println("player wins round");
                game(playerScore + 1, computerScore,totalGames+1);
            } else if (in == 'r' && c == 'p') {
                System.out.println("computer wins round");
                game(playerScore, computerScore + 1,totalGames+1);
            } else if (in == 's' && c == 'p') {
                System.out.println("player wins round");
                game(playerScore + 1, computerScore,totalGames+1);
            } else if (in == 's' && c == 'r') {
                System.out.println("computer wins round");
                game(playerScore, computerScore + 1,totalGames+1);
            } else if (in == 'p' && c == 'r') {
                System.out.println("player wins round");
                game(playerScore + 1, computerScore,totalGames+1);
            } else if (in == 'p' && c == 's') {
                System.out.println("computer wins round");
                game(playerScore, computerScore + 1,totalGames+1);
            } else {
                System.out.println("player input error");
                game(playerScore, computerScore,totalGames);
            }
        }else {
            System.out.println("games played: " + totalGames);
            if (playerScore > computerScore) {
                System.out.println("player wins");
            } else {
                System.out.println("player loses");
            }
        }
    }
}
