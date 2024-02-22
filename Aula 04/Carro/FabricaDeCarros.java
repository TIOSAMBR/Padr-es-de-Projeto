package Carro;

interface FabricaDeCarros {
    Carro produzirSedan();
    Carro produzirSUV();
    Carro produzirHatchback(); // Adicionando 
    Carro produzirPickup();    // Adicionando 
}

// carros da Ford
class FabricaFord implements FabricaDeCarros {
    @Override
    public Carro produzirSedan() {
        return new Sedan();
    }

    @Override
    public Carro produzirSUV() {
        return new SUV();
    }

    @Override
    public Carro produzirHatchback() {
        return new Hatchback();
    }

    @Override
    public Carro produzirPickup() {
        return new Pickup();
    }
}

// carros da Toyota
class FabricaToyota implements FabricaDeCarros {
    @Override
    public Carro produzirSedan() {
        return new Sedan();
    }

    @Override
    public Carro produzirSUV() {
        return new SUV();
    }

    @Override
    public Carro produzirHatchback() {
        return new Hatchback();
    }

    @Override
    public Carro produzirPickup() {
        return new Pickup();
    }
}
