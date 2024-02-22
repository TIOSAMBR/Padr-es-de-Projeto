package Carro;

interface Carro {
    void montar();
}

//  modelo Sedan
class Sedan implements Carro {
    @Override
    public void montar() {
        System.out.println("Montando Sedan");
    }
}

//  modelo SUV
class SUV implements Carro {
    @Override
    public void montar() {
        System.out.println("Montando SUV");
    }
}

class Hatchback implements Carro {
    @Override
    public void montar() { // Adicionando
        System.out.println("Montando Hatchback");
    }
}

//  modelo Pickup
class Pickup implements Carro { // Adicionando 
    @Override
    public void montar() {
        System.out.println("Montando Pickup");
    }
}
