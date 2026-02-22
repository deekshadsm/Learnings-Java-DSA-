interface Attackable {
    void attack();
}

interface Defendable {
    void defend();
}

interface MagicUser {
    void castSpell();
}

class Warrior implements Attackable, Defendable {
    public void attack() {
        System.out.println("Warrior swings sword!");
    }

    public void defend() {
        System.out.println("Warrior blocks with shield!");
    }
}

class Mage implements Attackable, MagicUser {
    public void attack() {
        System.out.println("Mage uses staff strike!");
    }

    public void castSpell() {
        System.out.println("Mage casts fireball!");
    }
}

class Game {
    public static void main(String[] args) {
        Warrior w = new Warrior();
        Mage m = new Mage();

        w.attack();
        w.defend();

        m.attack();
        m.castSpell();
    }
}