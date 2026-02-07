class LongestRepeatingSubstring {
    public static void main(String[] args) {
        String s = "banana";
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                int k = 0;

                while (i + k < s.length() &&
                       j + k < s.length() &&
                       s.charAt(i + k) == s.charAt(j + k)) {
                    k++;
                }

                if (k > longest.length()) {
                    longest = s.substring(i, i + k);
                }
            }
        }

        System.out.println("Longest Repeating Substring: " + longest);
    }
}
