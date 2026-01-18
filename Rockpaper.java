import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String computer = choices[rand.nextInt(3)];

        System.out.print("Enter rock, paper or scissors: ");
        String user = sc.next().toLowerCase();

        System.out.println("Computer chose: " + computer);

        if (user.equals(computer)) {
            System.out.println("It's a tie!");
        } else if (
                (user.equals("rock") && computer.equals("scissors")) ||
                (user.equals("paper") && computer.equals("rock")) ||
                (user.equals("scissors") && computer.equals("paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose , play again ");
        }

        sc.close();
    }
}
