import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < 20; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSum of array elements: " + sum);

        sc.close();
    }
}
