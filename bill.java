import java.util.Scanner;

public class Main {

    static double calculateBill(int units) {
        double bill;

        if (units <= 100)
            bill = units * 1.5;
        else if (units <= 200)
            bill = (100 * 1.5) + (units - 100) * 2.0;
        else
            bill = (100 * 1.5) + (100 * 2.0) + (units - 200) * 3.0;

        return bill;
    }

  
    static void displayBill(double amount) {
        System.out.println("Total Electricity Bill: ₹" + amount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill = calculateBill(units);
        displayBill(bill);

        sc.close();
    }
}
