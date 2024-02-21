public class Main {
    public static void main(String[] args) {
        // Criando um pedido
        Order order = new Order(123, "John Doe", 100.0);

        // Processando o pedido e enviando e-mail de confirmação
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(order);
        orderProcessor.sendConfirmationEmail(order);
    }
}
