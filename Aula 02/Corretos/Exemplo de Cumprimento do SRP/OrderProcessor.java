public class OrderProcessor {
    public void processOrder(Order order) {
        System.out.println("Pedido processado com sucesso!");
    }

    public void sendConfirmationEmail(Order order) {
        System.out.println("E-mail de confirmação enviado para " + order.getCustomerName());
    }
}