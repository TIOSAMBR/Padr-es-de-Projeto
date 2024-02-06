// Uso da aplicação
public class Main {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina();
        Aluno aluno1 = new AlunoImpl("João");
        Aluno aluno2 = new AlunoImpl("Maria");
        
        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);
    }
}