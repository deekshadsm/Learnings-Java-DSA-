class LowHealthException extends Exception {
    LowHealthException(String msg) {
        super(msg);
    }
}

class Game {
    static void attack(int health) throws LowHealthException {
        if (health < 20) {
            throw new LowHealthException("Game Over! Health too low to attack");
        }
        System.out.println("Attack successful!");
    }

    public static void main(String[] args) {
        try {
            attack(10);   // low health
        } catch (LowHealthException e) {
            System.out.println(e.getMessage());
        }
    }
}
