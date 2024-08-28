public class Main {
    public static void main(String[] args) {
        Plataforma netflix = new Plataforma();

        // Criando usuários
        Usuario usuario1 = new Usuario("Alice");
        Usuario usuario2 = new Usuario("Bruno");
        Usuario usuario3 = new Usuario("Carla");
        Usuario usuario4 = new Usuario("Diego");
        Usuario usuario5 = new Usuario("Eva");

        // Adicionando preferências de gênero
        usuario1.adicionarGenero("Ação");
        usuario2.adicionarGenero("Comédia");
        usuario3.adicionarGenero("Terror");
        usuario4.adicionarGenero("Anime");
        usuario5.adicionarGenero("Ficção Científica");
        usuario1.adicionarGenero("Terror"); // Alice também gosta de terror

        // Inscrevendo usuários
        netflix.inscrever(usuario1);
        netflix.inscrever(usuario2);
        netflix.inscrever(usuario3);
        netflix.inscrever(usuario4);
        netflix.inscrever(usuario5);

        // Simulando novos filmes/séries adicionados
        netflix.adicionarFilme("Ação", "Missão Impossível 7");
        netflix.adicionarFilme("Comédia", "Ted Lasso");
        netflix.adicionarFilme("Terror", "A Maldição da Casa Hill");
        netflix.adicionarFilme("Anime", "Naruto Shippuden");
        netflix.adicionarFilme("Ficção Científica", "Duna");
    }
}