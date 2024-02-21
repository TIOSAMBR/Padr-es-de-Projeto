public interface Shape {
    double calculateArea();


    //A classe Shape foi transformada em uma interface, e novas formas geométricas (por exemplo, Circle e Square) implementam essa interface. Cada forma geométrica é responsável por calcular sua própria área, sem a necessidade de modificar o código existente na classe Shape.
}