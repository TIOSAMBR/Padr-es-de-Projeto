// Implementação da classe Aluno
class AlunoImpl implements Aluno {
    private String nome;

    public AlunoImpl(String nome) {
        this.nome = nome;
    }

    @Override
    public void matricular() {
        System.out.println("O aluno " + nome + " foi matriculado na disciplina.");
    }
}