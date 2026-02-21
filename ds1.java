abstract class Warrior {
    String name;

    Warrior(String name) {
        this.name = name;
    }

    abstract void attack();

    void rest() {
        System.out.println(name + " is recovering energy.");
    }
}

class Slayer extends Warrior {
    Slayer(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " performs basic sword strike.");
    }
}

class FlameSlayer extends Slayer {
    FlameSlayer(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " unleashes Flame Breathing!");
    }
}

class WaterSlayer extends Slayer {
    WaterSlayer(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " uses Water Breathing technique!");
    }
}

class BattleField {
    public static void main(String[] args) {
        Warrior w1 = new FlameSlayer("Rengoku");
        Warrior w2 = new WaterSlayer("Tanjiro");

        w1.attack();
        w1.rest();

        w2.attack();
        w2.rest();
    }
}