package main.java.org.example;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private final int codigo;
    private List<Aluno> alunos;
    private Disciplina disciplina;
    private Professor professor;

    public Turma(int codigo) {
        this.codigo = codigo;
        this.alunos = new ArrayList<>(); // Inicialização da lista de alunos
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void addDisciplina(Disciplina disciplina1) {
        disciplina = disciplina1;
        disciplina1.addTurmas(this);
    }

    public Professor getProfessor() {
        return professor;
    }

    public void addProfessor(Professor professor) {
        this.professor = professor;
        professor.addTurmas(this);
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public String addAluno(Aluno aluno){
        if(alunos.size() <= 50){
            alunos.add(aluno);
            aluno.addTurmas(this);
            return "Aluno Adicionado";
        }
        else return "Turma Cheia";
    }

    public boolean abrirTurma(){
        return alunos.size() <= 50 && alunos.size() >= 10;
    }

    public String gerarPauta(){
        StringBuilder pauta = new StringBuilder();
        pauta.append("Pauta da Turma\n");
        pauta.append("Código da Turma: ").append(codigo).append("\n");
        pauta.append("Disciplina: ").append(disciplina.getNome()).append("\n");
        pauta.append("Professor: ").append(professor.getNome()).append("\n");
        pauta.append("Lista de alunos Inscritos:\n");
        for (Aluno aluno : alunos) {
            pauta.append(aluno.getNome()).append("\n");
        }
        return pauta.toString();
    }


}
