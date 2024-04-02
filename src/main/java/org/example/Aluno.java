package main.java.org.example;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private final int matricula;
    private final String nome;
    private List<Turma> turmas = new ArrayList<>();

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String addTurmas(Turma turma){
        turmas.add(turma);
        return "Aluno foi adiconado á: " + turma.getCodigo();
    }

    public String exibirTurmas() {
        StringBuilder exibicao = new StringBuilder();
        exibicao.append("Aluno: " + this.nome + "\n" + "Turmas: " + "\n");
        for(var turma : turmas) {
            String texto =
                    "Codigo: " + turma.getCodigo() +
                    "\nDisciplina: " + turma.getDisciplina().getNome() +
                    "\n";
            exibicao.append(texto);
        }
        return exibicao.toString();
    }
}
