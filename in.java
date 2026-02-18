class SmartDevice {
    String deviceName;

    SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    void operate() {
        System.out.println("Operating smart device");
    }
}

class SmartLight extends SmartDevice {
    SmartLight(String name) {
        super(name);
    }

    @Override
    void operate() {
        System.out.println(deviceName + " light turned ON");
    }
}

class SmartFan extends SmartDevice {
    SmartFan(String name) {
        super(name);
    }

    @Override
    void operate() {
        System.out.println(deviceName + " fan started at medium speed");
    }
}

class SmartDoor extends SmartDevice {
    SmartDoor(String name) {
        super(name);
    }

    @Override
    void operate() {
        System.out.println(deviceName + " door locked securely");
    }
}

class Home {
    public static void main(String[] args) {
        SmartDevice d1 = new SmartLight("Bedroom");
        SmartDevice d2 = new SmartFan("Living Room");
        SmartDevice d3 = new SmartDoor("Main");

        d1.operate();
        d2.operate();
        d3.operate();
    }
}
