import java.util.ArrayList;
import java.util.List;

class Plataforma {
    private List<Observer> observadores;
    private String genero;

    public Plataforma() {
        observadores = new ArrayList<>();
    }

    // Inscreve um observador
    public void inscrever(Observer observer) {
        observadores.add(observer);
    }

    // Remove um observador
    public void desinscrever(Observer observer) {
        observadores.remove(observer);
    }

    // Notifica todos os observadores inscritos no gênero correspondente
    public void notificar(String genero, String mensagem) {
        for (Observer observer : observadores) {
            observer.atualizar(genero, mensagem);
        }
    }

    // Adiciona novo filme/série e notifica os inscritos
    public void adicionarFilme(String genero, String titulo) {
        System.out.println("Novo filme/série adicionado: " + titulo + " [" + genero + "]");
        notificar(genero, "Novo " + genero + " disponível: " + titulo);
    }
}