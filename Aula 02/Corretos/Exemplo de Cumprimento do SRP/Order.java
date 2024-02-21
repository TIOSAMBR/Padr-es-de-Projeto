public class Order {
    private int orderId;
    private String customerName;
    private double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Agora tem apenas a responsabilidade de representar um pedido de compra. As responsabilidades de processar o pedido e enviar e-mails de confirmação foram movidas para a classe OrderProcessor, que agora é responsável apenas por essas tarefas.
}