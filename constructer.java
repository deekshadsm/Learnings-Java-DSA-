class BankAccount {

    double balance;

    // Constructor
    BankAccount() {
        balance = 1000;   
        System.out.println("Account created with balance: ₹" + balance);
    }

    void showBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating object , constructor is called automatically
        BankAccount acc = new BankAccount();

        acc.showBalance();
    }
}
