// Classe abstrata para representar um Aluno
abstract class Aluno {
    abstract void matricular();
}

// Implementação da classe Aluno
class AlunoImpl extends Aluno {
    private String nome;

    public AlunoImpl(String nome) {
        this.nome = nome;
    }

    @Override
    void matricular() {
        System.out.println("O aluno " + nome + " foi matriculado na disciplina.");
    }
}