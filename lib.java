import java.util.Scanner;

public class Main {

    static int calculateFine(int daysLate) {
        if (daysLate <= 5)
            return daysLate * 1;
        else if (daysLate <= 10)
            return daysLate * 2;
        else
            return daysLate * 5;
    }


    static void showFine(int fine) {
        System.out.println("Library Fine: ₹" + fine);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of late days: ");
        int days = sc.nextInt();

        int fine = calculateFine(days);
        showFine(fine);

        sc.close();
    }
}
