import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(10) + 1; 
        int guess;

        System.out.print("Guess a number between 1 and 10: ");
        guess = sc.nextInt();

        if (guess == number) {
            System.out.println("Correct :) You won!");
        } else {
            System.out.println(" Wrong :( The number was: " + number);
        }

        sc.close();
    }
}
