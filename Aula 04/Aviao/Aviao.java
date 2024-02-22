package Aviao;

interface Aviao {
    void montar();
}

//  Avião Comercial
class AviaoComercial implements Aviao {
    @Override
    public void montar() {
        System.out.println("Montando Avião Comercial");
    }
}

//  Avião de Carga
class AviaoCarga implements Aviao {
    @Override
    public void montar() {
        System.out.println("Montando Avião de Carga");
    }
}

//  Avião Executivo
class AviaoExecutivo implements Aviao {
    @Override
    public void montar() {
        System.out.println("Montando Avião Executivo");
    }
}

//  Avião Militar
class AviaoMilitar implements Aviao { // Adicionando 
    @Override
    public void montar() {
        System.out.println("Montando Avião Militar");
    }
}
