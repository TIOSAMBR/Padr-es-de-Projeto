public class Main {
    public static void main(String[] args) {
        Assinatura assinatura = new Assinatura();
        assinatura.mostrarAssinatura();

        assinatura.adicionarPacote("Pacote 1 - Assistir vídeos em vários dispositivos");
        assinatura.adicionarPacote("Pacote 1 - Assistir vídeos em vários dispositivos"); // Tentativa de duplicação
        assinatura.adicionarPacote("Pacote 3 - Caixa surpresa com produtos relacionados a filmes e séries");
        assinatura.mostrarAssinatura();

        assinatura.removerPacote("Pacote 1 - Assistir vídeos em vários dispositivos");
        assinatura.mostrarAssinatura();
    }
}