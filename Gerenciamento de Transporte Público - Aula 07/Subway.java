class Subway implements Transport {
    private int capacity;
    private String lines;
    private int averageSpeed;

    public Subway(int capacity, String lines, int averageSpeed) {
        this.capacity = capacity;
        this.lines = lines;
        this.averageSpeed = averageSpeed;
    }

    @Override
    public void managePassengers() {
        System.out.println("Gerenciando passageiros no metrô.");
    }

    public void showCapacity() {
        System.out.println("Capacidade de passageiros do metrô: " + capacity);
    }

    public void showLines() {
        System.out.println("Linhas do metrô: " + lines);
    }

    public void showAverageSpeed() {
        System.out.println("Velocidade média do metrô: " + averageSpeed + " km/h");
    }
}