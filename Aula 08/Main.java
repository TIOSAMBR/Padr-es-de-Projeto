public class Main {
    public static void main(String[] args) {
        ViolaoFactory factory = new ViolaoFactory();

        // Cliente escolhe um tipo de violão
        String tipoEscolhido = "Duplo Zero"; // Altere para o tipo desejado
        //Tipos : Classico / Folk / Flet / Jumbo / 7 Cordas / 12 Cordas / Zero / Duplo Zero / Triplo Zero

        // A fábrica cria uma cópia do protótipo escolhido
        ViolaoPrototype violao = factory.criarViolao(tipoEscolhido);

        // Exibe informações sobre o violão criado
        System.out.println("Violão criado: " + violao.getTipo());
        System.out.println("Cordas: " + violao.getCordas());
        System.out.println("Acústico: " + violao.isAcustico());
        System.out.println("Elétrico: " + violao.isEletrico());
        System.out.println("Descrição: " + violao.getDescricao());
    }
}