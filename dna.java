class DNA_LCS {
    public static void main(String[] args) {
        String dna1 = "ACGTAC";
        String dna2 = "CGTGA";

        int m = dna1.length();
        int n = dna2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (dna1.charAt(i - 1) == dna2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        System.out.println("Length of LCS: " + dp[m][n]);
    }
}
