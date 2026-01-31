class StringComplex {
    public static void main(String[] args) {
        String s = "madam level";

        String[] words = s.split(" ");
        System.out.println("Word count: " + words.length);


        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println("Reversed: " + rev);

        String clean = s.replace(" ", "");
        String revClean = "";
        for (int i = clean.length() - 1; i >= 0; i--) {
            revClean += clean.charAt(i);
        }

        if (clean.equals(revClean))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
