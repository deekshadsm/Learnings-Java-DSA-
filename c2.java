class DeliveryOrder {

    int orderId;
    String status;

    void showStatus() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Current Status: " + status);
    }

    void updateStatus(String newStatus) {
        status = newStatus;
        System.out.println("Status updated to: " + status);
    }
}

public class DeliveryTest {

    public static void main(String[] args) {

        DeliveryOrder order1 = new DeliveryOrder();

        order1.orderId = 101;
        order1.status = "Preparing";

        order1.showStatus();
        order1.updateStatus("Out for Delivery");
        order1.showStatus();
    }
}