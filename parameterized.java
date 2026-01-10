class Student {
    int id;
    String name;
    Student(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Deeksha");
        s1.display();
    }
}
