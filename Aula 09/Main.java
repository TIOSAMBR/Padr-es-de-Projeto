public class Main {
    public static void main(String[] args) {
        //  sanduíche padrão 
        SanduichePadraoBuilder builder1 = new SanduichePadraoBuilder();
        SanduicheDirector director1 = new SanduicheDirector(builder1);
        director1.construirSanduiche();
        Sanduiche sanduichePadrao = director1.getSanduiche();
        System.out.println("Sanduíche Padrão: " + sanduichePadrao);

        //  sanduíche vegetariano
        SanduicheVegetarianoBuilder builder2 = new SanduicheVegetarianoBuilder();
        SanduicheDirector director2 = new SanduicheDirector(builder2);
        director2.construirSanduiche();
        Sanduiche sanduicheVegetariano = director2.getSanduiche();
        System.out.println("Sanduíche Vegetariano: " + sanduicheVegetariano);

        //  sanduíche personalizado
        SanduicheBuilder builder3 = new SanduicheBuilder() {
            private Sanduiche sanduiche = new Sanduiche();

            public void buildPao() {
                sanduiche.setPao("Integral");
            }

            public void buildRecheios() {
                sanduiche.addRecheio("Frango");
                sanduiche.addRecheio("Queijo");
                sanduiche.addRecheio("Tomate");
            }

            public void buildCondimentos() {
                sanduiche.addCondimento("Mostarda");
                sanduiche.addCondimento("Ketchup");
            }

            public Sanduiche getSanduiche() {
                return sanduiche;
            }
        };

        SanduicheDirector director3 = new SanduicheDirector(builder3);
        director3.construirSanduiche();
        Sanduiche sanduichePersonalizado = director3.getSanduiche();
        System.out.println("Sanduíche Personalizado: " + sanduichePersonalizado);
    }
}