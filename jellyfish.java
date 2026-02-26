import java.util.Random;
import java.util.Scanner;

public class JellyfishHunt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;

        System.out.println("🍍 Welcome to SpongeBob's Jellyfish Hunt!");
        System.out.println("Catch jellyfish for 5 rounds!");
        System.out.println("----------------------------------");

        for (int round = 1; round <= 5; round++) {

            System.out.println("\nRound " + round + " - Press 'c' to catch!");
            char input = sc.next().charAt(0);

            if (input == 'c' || input == 'C') {

                int chance = rand.nextInt(10);

                if (chance == 9) {
                    System.out.println("🌟 GOLDEN JELLYFISH! +50 points!");
                    totalScore += 50;
                } else {
                    int points = rand.nextInt(20) + 1;
                    System.out.println("🪼 You caught a jellyfish! +" + points + " points!");
                    totalScore += points;
                }

            } else {
                System.out.println("❌ Missed! No points this round.");
            }
        }

        System.out.println("\n🏁 Game Over!");
        System.out.println("Your Total Score: " + totalScore);

        if (totalScore >= 100) {
            System.out.println("🏆 You are the Jellyfish Master of Bikini Bottom!");
        } else {
            System.out.println("😅 Keep practicing at Jellyfish Fields!");
        }

        sc.close();
    }
}