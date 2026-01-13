abstract class Shape {
    abstract void area();
}

class Rectangle extends Shape {
    int l = 10, b = 5;

    void area() {
        System.out.println("Area of Rectangle: " + (l * b));
    }
}

class Circle extends Shape {
    double r = 7;

    void area() {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }

    public static void main(String[] args) {
        Shape s;

        s = new Rectangle();
        s.area();

        s = new Circle();
        s.area();
    }
}
