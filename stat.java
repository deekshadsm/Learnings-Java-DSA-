class Demo {
    static {
        System.out.println("Static block executed");
    }

    Demo() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
    }
}
