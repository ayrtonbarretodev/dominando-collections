package br.com.ayrton;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();

        alunos.add("Ayrton Barreto");
        alunos.add("Alana Larissa");
        alunos.add("Amanda Mayara");
        alunos.add("Alexandre Hilário");
        alunos.add("Ana Hilário");
        alunos.add("Francisca Maria");

        System.out.println("Tamanho da coleção: " + alunos.size());

        //adicionando um aluno que já existe
        alunos.add("Francisca Maria");

        //O Set ignora elementos repetidos, por isso o tamanho continua o mesmo
        System.out.println("Tamanho da coleção: " + alunos.size());

    }
}
