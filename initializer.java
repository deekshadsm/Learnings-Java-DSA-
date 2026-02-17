class Test {
    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Instance initializer block");
    }

    Test() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Test();
        new Test();
    }
}
