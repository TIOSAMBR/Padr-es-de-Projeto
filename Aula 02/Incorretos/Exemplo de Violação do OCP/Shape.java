public class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public double calculateArea() {
        if (type.equals("circle")) {
            return Math.PI * Math.pow(5, 2); // Área de um círculo com raio 5
        } else if (type.equals("square")) {
            return 5 * 5; // Área de um quadrado com lado 5
        }
        return 0;
    }
}
