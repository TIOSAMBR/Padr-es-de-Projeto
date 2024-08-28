import java.util.ArrayList;
import java.util.List;

class Usuario implements Observer {
    private String nome;
    private List<String> preferenciasGenero;

    public Usuario(String nome) {
        this.nome = nome;
        this.preferenciasGenero = new ArrayList<>();
    }

    // Adiciona preferência de gênero
    public void adicionarGenero(String genero) {
        preferenciasGenero.add(genero);
    }

    // Remove preferência de gênero
    public void removerGenero(String genero) {
        preferenciasGenero.remove(genero);
    }

    // Recebe notificação se o usuário estiver inscrito no gênero
    @Override
    public void atualizar(String genero, String mensagem) {
        if (preferenciasGenero.contains(genero)) {
            System.out.println("Notificação para " + nome + ": " + mensagem);
        }
    }
}