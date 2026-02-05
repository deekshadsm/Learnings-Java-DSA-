class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "banana";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean exists = false;

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == ch) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                result += ch;
            }
        }

        System.out.println("After removing duplicates: " + result);
    }
}
