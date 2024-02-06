// Classe para representar uma Disciplina

import java.util.ArrayList;
import java.util.List;

class Disciplina {
    private List<Aluno> alunosMatriculados = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
        aluno.matricular();
    }

    public void removerAluno(Aluno aluno) {
        alunosMatriculados.remove(aluno);
    }
}