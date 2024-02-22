package Aviao;

interface FabricaDeAvioes {
    Aviao produzirAviaoComercial();
    Aviao produzirAviaoCarga();
}

// Implementação aviões Boeing
class FabricaBoeing implements FabricaDeAvioes {
    @Override
    public Aviao produzirAviaoComercial() {
        return new AviaoComercial();
    }

    @Override
    public Aviao produzirAviaoCarga() {
        return new AviaoCarga();
    }
}

// Implementação aviões Airbus
class FabricaAirbus implements FabricaDeAvioes {
    @Override
    public Aviao produzirAviaoComercial() {
        return new AviaoComercial();
    }

    @Override
    public Aviao produzirAviaoCarga() {
        return new AviaoCarga();
    }
}

// Implementação aviões Embraer 
class FabricaEmbraer implements FabricaDeAvioes { // Adicionando 
    @Override
    public Aviao produzirAviaoComercial() {
        return new AviaoExecutivo();
    }

    @Override
    public Aviao produzirAviaoCarga() {
        return new AviaoMilitar();
    }
}