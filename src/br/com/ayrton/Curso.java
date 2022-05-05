package br.com.ayrton;

import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private int tTotal;
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer,Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        //devolve uma lista na qual não é possível fazer alterações, como apagar ou até mesmo adicionar na lista.
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public int gettTotal() {
        return tTotal;
    }

    public void adiciona(Aula a) {
        this.aulas.add(a);

        tTotal += a.getTempo();
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(),aluno);
    }


    public int getTempoTotal() {
        int tempoTotal = 0;
        for (Aula aula : aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;

        //outra forma - Java 8
        //return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public boolean estaMatriculado(Aluno a) {
        return this.alunos.contains(a);
    }

    public Aluno buscaMatriculado(int numero){
        if (!matriculaParaAluno.containsKey(numero))
            throw new NoSuchElementException();
        return matriculaParaAluno.get(numero);
    }

    @Override
    public String toString() {
        return "[Curso: " + nome + ", tempo total: " + tTotal + "]";
    }
}
