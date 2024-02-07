// Classe para implementar a disciplina e o controle de matrículas usando Interfaces

import java.util.ArrayList;
import java.util.List;

class DisciplinaImpl implements Disciplina {
    private List<Aluno> alunosMatriculados = new ArrayList<>();

    @Override
    public void adicionarAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
        aluno.matricular();
    }

    @Override
    public void removerAluno(Aluno aluno) {
        alunosMatriculados.remove(aluno);
    }
}