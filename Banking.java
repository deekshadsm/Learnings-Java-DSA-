import java.util.Scanner;

public class Banking {

    public static void main(String[] args) {

        // JAVA BANKING PROGRAM FOR BEGINNERS

        // DECLARE VARIABLES
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        int choice;
        boolean running = true;

        while (running) {

            // DISPLAY MENU
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // GET AND PROCESS USERS CHOICE
            choice = sc.nextInt();

            switch (choice) {

                // showBalance()
                case 1:
                    System.out.println("Your balance is: ₹" + balance);
                    break;

                // deposit()
                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Amount deposited successfully.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                // withdraw()
                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Please collect your cash.");
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;

                // EXIT MESSAGE
                case 4:
                    System.out.println("Thank you for using the bank!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
