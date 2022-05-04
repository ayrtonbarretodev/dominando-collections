package br.com.ayrton;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaColecoes.adiciona(new Aula("Criando uma aula",20));
        javaColecoes.adiciona(new Aula("Modelando com coleções",24));

        javaColecoes.matricula(new Aluno("Rodrigo Turini",34672));
        javaColecoes.matricula(new Aluno("Guilherme Silveira",5617));
        javaColecoes.matricula(new Aluno("Mauricio Aniche",17645));

        System.out.println("Todos os alunos matriculados:");

        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });
    }
}
