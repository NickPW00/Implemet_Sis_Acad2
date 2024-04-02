package main.java.org.example;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private final int matricula;
    private final String nome;
    private List<Turma> turmas = new ArrayList<>();

    public Professor(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void addTurmas(Turma turma){
        turmas.add(turma);
        System.out.println("Professor foi adiconado á: " + turma.getCodigo());
    }

    public String exibirTurma() {
        StringBuilder exibicao = new StringBuilder();
        exibicao.append("Professor: " + this.nome + "\n" + "Turmas: " + "\n");
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
