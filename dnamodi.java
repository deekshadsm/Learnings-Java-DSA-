class DNAMotifSearch {
    public static void main(String[] args) {
        String dna = "ACGTACGTACG";
        String motif = "ACG";

        int count = 0;

        for (int i = 0; i <= dna.length() - motif.length(); i++) {
            if (dna.substring(i, i + motif.length()).equals(motif)) {
                count++;
            }
        }

        System.out.println("Motif count: " + count);
    }
}
