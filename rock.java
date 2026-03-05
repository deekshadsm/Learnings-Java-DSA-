class Rocket {

    String rocketName;
    int fuelLevel;

    void checkFuel() {
        System.out.println("Fuel Level: " + fuelLevel + "%");
    }

    void launch() {
        if (fuelLevel >= 70) {
            System.out.println(rocketName + " 🚀 Launch Successful!");
        } else {
            System.out.println("Not enough fuel to launch.");
        }
    }
}

public class RocketTest {

    public static void main(String[] args) {

        Rocket r1 = new Rocket();

        r1.rocketName = "Apollo-X";
        r1.fuelLevel = 80;

        r1.checkFuel();
        r1.launch();
    }
}