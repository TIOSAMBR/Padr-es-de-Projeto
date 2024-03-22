class SubwayFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Subway(2000, "Linhas de metrô", 60); 
    }
}
