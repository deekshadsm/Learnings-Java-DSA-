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

    static void addMatrix(int[][] a, int[][] b, int[][] sum) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
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
        int[][] sum = new int[2][2];

        System.out.println("Enter first matrix:");
        readMatrix(a);

        System.out.println("Enter second matrix:");
        readMatrix(b);

        addMatrix(a, b, sum);

        System.out.println("Sum of matrices:");
        displayMatrix(sum);
    }
}
