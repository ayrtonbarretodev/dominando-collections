package br.com.ayrton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();

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
        //devolve uma cópia de tal forma que ela não possa ser alterada diretamente pelo atributo
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona (Aula a){
        this.aulas.add(a);
    }
}
