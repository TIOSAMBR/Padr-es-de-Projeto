package Aviao;

public class Cliente {
    private Aviao aviaoComercial;
    private Aviao aviaoCarga;

    public Cliente(FabricaDeAvioes fabrica) {
        aviaoComercial = fabrica.produzirAviaoComercial();
        aviaoCarga = fabrica.produzirAviaoCarga();
    }

    public void montarAvioes() {
        aviaoComercial.montar();
        aviaoCarga.montar();
    }

    public static void main(String[] args) {
        FabricaDeAvioes fabricaBoeing = new FabricaBoeing();
        Cliente clienteBoeing = new Cliente(fabricaBoeing);
        clienteBoeing.montarAvioes();

        FabricaDeAvioes fabricaAirbus = new FabricaAirbus();
        Cliente clienteAirbus = new Cliente(fabricaAirbus);
        clienteAirbus.montarAvioes();
        
        FabricaDeAvioes fabricaEmbraer = new FabricaEmbraer();
        Cliente clienteEmbraer = new Cliente(fabricaEmbraer);
        clienteEmbraer.montarAvioes();
    }
}