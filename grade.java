import java.util.Scanner;

public class Main {

    static int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    static char calculateGrade(int total) {
        if (total >= 270)
            return 'A';
        else if (total >= 200)
            return 'B';
        else
            return 'C';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks 3: ");
        int m3 = sc.nextInt();

        int total = calculateTotal(m1, m2, m3);
        char grade = calculateGrade(total);

        System.out.println("Total Marks: " + total);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
