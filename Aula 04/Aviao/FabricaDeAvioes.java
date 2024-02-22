package Aviao;

interface FabricaDeAvioes {
    Aviao produzirAviaoComercial();
    Aviao produzirAviaoCarga();
}

//  aviões Boeing
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

//  aviões Airbus
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

//  aviões Embraer 
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
