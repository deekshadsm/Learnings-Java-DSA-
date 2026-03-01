
abstract class SmartDevice {

    protected String deviceName;
    protected boolean isOn;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(deviceName + " is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(deviceName + " is now OFF.");
    }

    abstract void performFunction();
}
class SmartLight extends SmartDevice {

    public SmartLight(String name) {
        super(name);
    }

    @Override
    void performFunction() {
        if (isOn)
            System.out.println(deviceName + " is adjusting brightness.");
        else
            System.out.println(deviceName + " is OFF. Cannot adjust brightness.");
    }
}


class SmartAC extends SmartDevice {

    public SmartAC(String name) {
        super(name);
    }

    @Override
    void performFunction() {
        if (isOn)
            System.out.println(deviceName + " is cooling the room.");
        else
            System.out.println(deviceName + " is OFF. Cannot cool.");
    }
}


public class SmartHomeTest {

    public static void main(String[] args) {

        SmartDevice light = new SmartLight("Living Room Light");
        SmartDevice ac = new SmartAC("Bedroom AC");

        light.turnOn();
        light.performFunction();

        System.out.println("------------");

        ac.performFunction();
        ac.turnOn();
        ac.performFunction();
    }
}