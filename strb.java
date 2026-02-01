class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.reverse();

        System.out.println(sb);

        StringBuilder sbr = new StringBuilder("Java");
        sbr.insert(4, " Programming");

        System.out.println(sbr);
    }
}
