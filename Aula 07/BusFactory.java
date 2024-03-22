class BusFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Bus(50, "Dinheiro", "Rotas de ônibus");
    }
}