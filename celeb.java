class CelebrityProblem {
    static int findCelebrity(int[][] m, int n) {
        int a = 0, b = n - 1;

        while (a < b) {
            if (m[a][b] == 1)
                a++;
            else
                b--;
        }

        for (int i = 0; i < n; i++) {
            if (i != a && (m[a][i] == 1 || m[i][a] == 0))
                return -1;
        }

        return a;
    }

    public static void main(String[] args) {
        int[][] party = {
            {0, 1, 1},
            {0, 0, 1},
            {0, 0, 0}
        };

        int res = findCelebrity(party, 3);

        if (res == -1)
            System.out.println("No Celebrity");
        else
            System.out.println("Celebrity is person " + res);
    }
}
