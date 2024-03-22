class Bus implements Transport {
    private int capacity;
    private String paymentMethod;
    private String route;

    public Bus(int capacity, String paymentMethod, String route) {
        this.capacity = capacity;
        this.paymentMethod = paymentMethod;
        this.route = route;
    }

    @Override
    public void managePassengers() {
        System.out.println("Gerenciando passageiros em ônibus.");
    }

    public void showCapacity() {
        System.out.println("Capacidade de passageiros do ônibus: " + capacity);
    }

    public void showPaymentMethod() {
        System.out.println("Método de pagamento do ônibus: " + paymentMethod);
    }

    public void showRoute() {
        System.out.println("Rotas do ônibus: " + route);
    }
}
