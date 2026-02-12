class MinimumOrderException extends Exception {
    MinimumOrderException(String msg) {
        super(msg);
    }
}

class OrderService {
    static void placeOrder(int amount) throws MinimumOrderException {
        if (amount < 500) {
            throw new MinimumOrderException("Order must be at least ₹500");
        }
        System.out.println("Order placed successfully");
    }

    public static void main(String[] args) {
        try {
            placeOrder(300);  
        } catch (MinimumOrderException e) {
            System.out.println(e.getMessage());
        }
    }
}
