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

    static void multiplyMatrix(int[][] a, int[][] b, int[][] result) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }

    static void displayMatrix(int[][] m) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] result = new int[2][2];

        System.out.println("Enter first matrix:");
        readMatrix(a);

        System.out.println("Enter second matrix:");
        readMatrix(b);

        multiplyMatrix(a, b, result);

        System.out.println("Result matrix:");
        displayMatrix(result);
    }
}
