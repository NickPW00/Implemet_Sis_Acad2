package main.java.org.example;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private final int codigo;
    private final String nome;
    private List<Turma> turmas = new ArrayList<>();

    public Disciplina(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void addTurmas(Turma turma){
        turmas.add(turma);
        System.out.println("Disciplina foi adiconado á: " + turma.getCodigo());
    }

    public String exibirTurma() {
        StringBuilder exibicao = new StringBuilder();
        exibicao.append("Disciplinas  : " + this.nome + "\n" + "Turmas: " + "\n");
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
