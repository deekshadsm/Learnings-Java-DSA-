import java.util.Scanner;
import java.util.Random;

public class GaryFeedingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int hunger = 50;
        int happiness = 50;

        System.out.println("🐌 Welcome to Gary Care Simulator!");
        System.out.println("Keep Gary happy and not too hungry!");
        System.out.println("-----------------------------------");

        for (int day = 1; day <= 7; day++) {

            System.out.println("\nDay " + day);
            System.out.println("Hunger: " + hunger);
            System.out.println("Happiness: " + happiness);

            System.out.println("1 - Feed Gary");
            System.out.println("2 - Play with Gary");
            System.out.println("3 - Do Nothing");

            System.out.print("Choose action: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("🍪 You fed Gary!");
                hunger -= 20;
                happiness += 5;
            } 
            else if (choice == 2) {
                System.out.println("🎾 You played with Gary!");
                happiness += 15;
                hunger += 10;
            } 
            else {
                System.out.println("😴 You ignored Gary...");
                hunger += 15;
                happiness -= 10;
            }

            // Random daily effect
            hunger += rand.nextInt(10);
            happiness -= rand.nextInt(5);

            // Boundaries
            if (hunger < 0) hunger = 0;
            if (happiness > 100) happiness = 100;

            if (hunger >= 100) {
                System.out.println("😢 Gary got too hungry and is sick!");
                break;
            }

            if (happiness <= 0) {
                System.out.println("😐 Gary is upset and ignores you!");
                break;
            }
        }

        System.out.println("\n🐌 Game Over!");
        System.out.println("Final Hunger: " + hunger);
        System.out.println("Final Happiness: " + happiness);

        sc.close();
    }
}