package DataStructures;

public class Order {
    private String orderId;
    private double totalPrice;

    public Order(String orderId, double totalPrice) {
        this.orderId = orderId;
        this.totalPrice = totalPrice;
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
