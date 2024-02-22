package Carro;

public class Cliente {
    private Carro sedan;
    private Carro suv;
    private Carro hatchback; // Adicionando 
    private Carro pickup; // Adicionando 

    public Cliente(FabricaDeCarros fabrica) {
        sedan = fabrica.produzirSedan();
        suv = fabrica.produzirSUV();
        hatchback = fabrica.produzirHatchback();
        pickup = fabrica.produzirPickup();
    }

    public void montarCarros() {
        sedan.montar();
        suv.montar();
        hatchback.montar();
        pickup.montar();
    }

    public static void main(String[] args) {
        FabricaDeCarros fabricaFord = new FabricaFord();
        Cliente clienteFord = new Cliente(fabricaFord);
        clienteFord.montarCarros();

        FabricaDeCarros fabricaToyota = new FabricaToyota();
        Cliente clienteToyota = new Cliente(fabricaToyota);
        clienteToyota.montarCarros();
    }
}