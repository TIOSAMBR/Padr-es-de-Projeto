public class TransportManagementSystem {
    public static void main(String[] args) {
        //  fábricas de transporte
        TransportFactory busFactory = new BusFactory();
        TransportFactory subwayFactory = new SubwayFactory();

        //  ônibus e metrô usando as fábricas
        Transport bus = busFactory.createTransport();
        Transport subway = subwayFactory.createTransport();

        // exibindo características de ônibus
        System.out.println("Gerenciando ônibus:");
        bus.managePassengers();
        if (bus instanceof Bus) {
            ((Bus) bus).showCapacity();
            ((Bus) bus).showPaymentMethod();
            ((Bus) bus).showRoute();
        }

        // exibindo características de metrô
        System.out.println("\nGerenciando metrô:");
        subway.managePassengers();
        if (subway instanceof Subway) {
            ((Subway) subway).showCapacity();
            ((Subway) subway).showLines();
            ((Subway) subway).showAverageSpeed();
        }
    }
}