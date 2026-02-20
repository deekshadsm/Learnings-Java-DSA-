class Slayer {
    String name;

    Slayer(String name) {
        this.name = name;
    }

    void attack() {
        System.out.println("Basic sword attack");
    }
}

class FlameBreathing extends Slayer {
    FlameBreathing(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " uses Flame Breathing: Blazing Slash!");
    }
}

class WaterBreathing extends Slayer {
    WaterBreathing(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " uses Water Breathing: Flowing Strike!");
    }
}

class ThunderBreathing extends Slayer {
    ThunderBreathing(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " uses Thunder Breathing: Lightning Dash!");
    }
}

class Battle {
    public static void main(String[] args) {
        Slayer s1 = new FlameBreathing("Rengoku");
        Slayer s2 = new WaterBreathing("Tanjiro");
        Slayer s3 = new ThunderBreathing("Zenitsu");

        s1.attack();
        s2.attack();
        s3.attack();
    }
}