// Interface para representar um Aluno
interface Aluno {
    void matricular();
}

// Interface para representar uma Disciplina
interface Disciplina {
    void adicionarAluno(Aluno aluno);
    void removerAluno(Aluno aluno);
}

// Uso da aplicação
public class Main {
    public static void main(String[] args) {
        Disciplina disciplina = new DisciplinaImpl();
        Aluno aluno1 = new AlunoImpl("João");
        Aluno aluno2 = new AlunoImpl("Maria");
        
        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);
    }
}
