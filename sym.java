import java.util.Scanner;

public class Main {

    static void readMatrix(int[][] m) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = sc.nextInt();
            }
        }
    }

    static boolean isSymmetric(int[][] m) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (m[i][j] != m[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    static void displayMatrix(int[][] m) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }