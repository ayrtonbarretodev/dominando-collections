package br.com.ayrton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaListaDeAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArrayLists",21);
        Aula a2 = new Aula("Listas de Objetos",20);
        Aula a3 = new Aula("Relacionamento de listas e objetos",15);

        List<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        //System.out.println(aulas);
        aulas.forEach(aula -> System.out.println(aula));

        System.out.println();

        //implementando a interface Comparable<Aula> na classe Aula e consequentemente seu método
        Collections.sort(aulas);
        System.out.println("Modo com implentação da interface Comparable na classe Aula");
        aulas.forEach(aula -> System.out.println(aula));

        System.out.println();

        //com lambda
        Collections.sort(aulas, (a11, a21) -> {
            String tituloa1 = a11.getTitulo();
            String tituloa2 = a21.getTitulo();
            return tituloa1.compareTo(tituloa2);
        });
        System.out.println("Modo com implentação com lambda dentro do próprio método");
        aulas.forEach(aula -> System.out.println(aula));


        System.out.println();

        Collections.sort(aulas, Comparator.comparingInt(Aula::getTempo));
        //ou
        aulas.sort(Comparator.comparingInt(Aula::getTempo));
        System.out.println("Comparando pelo tempo - implementação com o Comparator.comparingInt()");
        aulas.forEach(aula -> System.out.println(aula));
    }
}
