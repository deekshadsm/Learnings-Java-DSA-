class SpaceUnit {
    String name;

    SpaceUnit(String name) {
        this.name = name;
    }

    void executeMission() {
        System.out.println("Executing generic mission");
    }
}

class Rocket extends SpaceUnit {
    Rocket(String name) {
        super(name);
    }

    @Override
    void executeMission() {
        System.out.println(name + " launching into space!");
    }
}

class Satellite extends SpaceUnit {
    Satellite(String name) {
        super(name);
    }

    @Override
    void executeMission() {
        System.out.println(name + " entering Earth orbit.");
    }
}

class Rover extends SpaceUnit {
    Rover(String name) {
        super(name);
    }

    @Override
    void executeMission() {
        System.out.println(name + " exploring planetary surface.");
    }
}

class MissionControl {
    public static void main(String[] args) {
        SpaceUnit u1 = new Rocket("Apollo");
        SpaceUnit u2 = new Satellite("Hubble");
        SpaceUnit u3 = new Rover("Mars Rover");

        u1.executeMission();
        u2.executeMission();
        u3.executeMission();
    }
}
