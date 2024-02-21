public class Main {
    public static <Rectangle, Square> void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println("Área do retângulo: " + rectangle.getArea());

        Square square = new Square();
        square.setSide(5);
        System.out.println("Área do quadrado: " + square.getArea());
    }
}
