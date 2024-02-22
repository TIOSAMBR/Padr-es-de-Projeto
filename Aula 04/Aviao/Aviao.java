package Aviao;

interface Aviao {
    void montar();
}

// Implementação Avião Comercial
class AviaoComercial implements Aviao {
    @Override
    public void montar() {
        System.out.println("Montando Avião Comercial");
    }
}

// Implementação Avião de Carga
class AviaoCarga implements Aviao {
    @Override
    public void montar() {
        System.out.println("Montando Avião de Carga");
    }
}

// Implementação Avião Executivo
class AviaoExecutivo implements Aviao {
    @Override
    public void montar() {
        System.out.println("Montando Avião Executivo");
    }
}

// Implementação Avião Militar
class AviaoMilitar implements Aviao { // Adicionando 
    @Override
    public void montar() {
        System.out.println("Montando Avião Militar");
    }
}