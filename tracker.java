import java.util.Scanner;

public class Main {

    static void showHabits() {
        System.out.println("1. Drink Water");
        System.out.println("2. Exercise");
        System.out.println("3. Read Book");
    }

    static void checkHabit(int choice) {
        if (choice == 1) {
            System.out.println("Great! Stay hydrated.");
        } else if (choice == 2) {
            System.out.println(" Nice! Keep moving.");
        } else if (choice == 3) {
            System.out.println(" Awesome! Knowledge grows.");
        } else {
            System.out.println("Invalid habit choice.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Today's Habits:");
        showHabits();

        System.out.print("Which habit did you complete? ");
        int choice = sc.nextInt();

        checkHabit(choice);

        sc.close();
    }
}
