package main.java.org.example;

public class App 
{
    public static void main( String[] args )
    {
        Aluno aluno1 = new Aluno(12345, "Aluno 1");
        Aluno aluno2 = new Aluno(54321, "Aluno 2");
        Aluno aluno3 = new Aluno(15243, "Aluno 3");
        Aluno aluno4 = new Aluno(32415, "Aluno 4");
        Aluno aluno5 = new Aluno(34251, "Aluno 5");

        Professor professro1 = new Professor(51423, "Professor1");
        Professor professro2 = new Professor(51423, "Professor2");

        Disciplina disciplina1 = new Disciplina(21345, "Disciplina1");
        Disciplina disciplina2 = new Disciplina(21345, "Disciplina2");

        Turma turma1 = new Turma(45123);
        Turma turma2 = new Turma(43215);

        turma1.addProfessor(professro1);
        turma2.addProfessor(professro2);

        turma1.addDisciplina(disciplina2);
        turma2.addDisciplina(disciplina1);

        turma1.addAluno(aluno1);
        turma1.addAluno(aluno3);
        turma1.addAluno(aluno5);

        turma2.addAluno(aluno2);
        turma2.addAluno(aluno4);
        turma2.addAluno(aluno5);

        System.out.println(aluno5.exibirTurmas());
        System.out.println(aluno1.exibirTurmas());

        System.out.println(professro2.exibirTurma());

        System.out.println(disciplina1.exibirTurma());

    }
}
