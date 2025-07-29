import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        System.out.println("WELCOME TO MY GAME");  // Welcome message
        Scanner sc = new Scanner(System.in);       // Scanner for user input

        int us = 0;  // Variable to store user's choice (1=rock, 2=paper, 3=scissor)
        try{
            System.out.println("CHOOSE ONE :(ROCK),(PAPER),(SCISSOR)");
            String user = sc.next().toLowerCase();  // Read user input and convert to lowercase

            while (true){
                if(user.equalsIgnoreCase("rock")){
                    us = 1;  // Rock
                    break;
                } else if (user.equalsIgnoreCase("paper")) {
                    us = 2;  // Paper
                    break;
                } else if (user.equalsIgnoreCase("scissor")) {
                    us = 3;  // Scissor
                    break;
                } else {
                    System.out.println("Invalid Input");  // If input doesn't match
                    user = sc.next().toLowerCase();       // Ask for input again
                }
            }
        } catch (Exception e){
            System.out.println("Invalid Input");  // Catch input error
        }

        Random ra = new Random();
        int computer = ra.nextInt(3) + 1;  // Random number between 1 and 3

        // Display what the computer chose
        if(computer==1){
            System.out.println("COMPUTER CHOOSES ROCK");
        } else if (computer==2) {
            System.out.println("COMPUTER CHOOSES PAPER");
        } else {
            System.out.println("COMPUTER CHOOSE SCISSOR");
        }

        // Determine the winner
        if(us == computer){
            System.out.println("IT'S A DRAW");  // If both chose the same
        } else if ((us == 1 && computer == 3) || (us == 2 && computer == 1) || (us == 3 && computer == 2)) {
            System.out.println("YOU WIN");      // Winning conditions
        } else {
            System.out.println("COMPUTER WINS");  // Else computer wins
        }
    }
}
