import java.util.Scanner;
import java.util.Random;

public class BikiniAdventure {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int size = 5;
        char[][] map = new char[size][size];

        int playerRow = 0;
        int playerCol = 0;
        int score = 0;
         for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = '❌';
            }
        }

        
        map[rand.nextInt(size)][rand.nextInt(size)] = '💰';
        map[rand.nextInt(size)][rand.nextInt(size)] = '🦀';

        System.out.println("🍍 Welcome to Bikini Bottom Adventure!");
        System.out.println("Move using W A S D. 10 moves total.\n");

        for (int move = 1; move <= 10; move++) {

            map[playerRow][playerCol] = '😀';

        
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("Move (W/A/S/D): ");
            char input = sc.next().toUpperCase().charAt(0);

            map[playerRow][playerCol] = '❌';

            switch (input) {
                case 'W':
                    if (playerRow > 0) playerRow--;
                    break;
                case 'S':
                    if (playerRow < size - 1) playerRow++;
                    break;
                case 'A':
                    if (playerCol > 0) playerCol--;
                    break;
                case 'D':
                    if (playerCol < size - 1) playerCol++;
                    break;
            }

            if (map[playerRow][playerCol] == '💰') {
                System.out.println("🍔 You found a Krabby Patty! +20 points!");
                score += 20;
            }

            if (map[playerRow][playerCol] == '🦀') {
                System.out.println("🦀 Mr. Krabs gave you bonus! +50 points!");
                score += 50;
            }

            System.out.println("Score: " + score);
            System.out.println("---------------------");
        }

        System.out.println("🏁 Adventure Over!");
        System.out.println("Final Score: " + score);

        sc.close();
    }
}