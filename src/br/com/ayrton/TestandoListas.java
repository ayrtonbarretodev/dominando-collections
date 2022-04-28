package br.com.ayrton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

public class TestandoListas {
    public static void main(String[] args) {

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add("Conhecendo mais de listas");
        aulas.add("Modelando a classe Aula");
        aulas.add("Trabalhando com Cursos e Sets");

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        //foreach
        for (String aula:aulas) {
            System.out.println(aula + ", ");
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula);

        //fori
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("Aula: " + aulas.get(i));
        }

        //Java 8
        aulas.forEach(aula -> System.out.println(aula));

        System.out.println();
        System.out.println("Invertendo Lista");
        Collections.reverse(aulas);
        aulas.forEach(aula -> System.out.println(aula));

        System.out.println();
        System.out.println("Ordenando Lista");
        //Ordenando
        Collections.sort(aulas, Comparator.naturalOrder());
        //aulas.sort(Comparator.naturalOrder());
        aulas.forEach(aula -> System.out.println(aula));
    }
}
