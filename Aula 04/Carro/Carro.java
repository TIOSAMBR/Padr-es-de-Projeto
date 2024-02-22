package Carro;

interface Carro {
    void montar();
}

// Implementação modelo Sedan
class Sedan implements Carro {
    @Override
    public void montar() {
        System.out.println("Montando Sedan");
    }
}

// Implementação modelo SUV
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

// Implementação modelo Pickup
class Pickup implements Carro { // Adicionando 
    @Override
    public void montar() {
        System.out.println("Montando Pickup");
    }
}