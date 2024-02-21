public class Order {
    private int orderId;
    private String customerName;
    private double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public void processOrder() {
        System.out.println("Pedido processado com sucesso!");
    }

    public void sendConfirmationEmail() {
        System.out.println("E-mail de confirmação enviado para " + customerName);
    }
}
