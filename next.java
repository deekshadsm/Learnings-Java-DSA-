class Employee {
    int id;
    String name;
    double salary;

    Employee() {
        this(0, "bean", 0.0); 
    }

    Employee(int id, String name) {
        this(id, name, 20000);
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Deeksha");
        Employee e3 = new Employee(102, "rabiya", 45000);

        e1.display();
        e2.display();
        e3.display();
    }
}
