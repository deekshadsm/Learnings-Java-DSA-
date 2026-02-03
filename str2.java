class CharFrequency {
    public static void main(String[] args) {
        String s = "programming";
         for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            boolean counted = false;
            for (int k = 0; k < i; k++) {
                if (s.charAt(k) == ch) {
                    counted = true;
                    break;
                }
            }

            if (counted) continue;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch)
                    count++;
            }

            System.out.println(ch + " : " + count);
        }
    }
}
