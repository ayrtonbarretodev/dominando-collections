package br.com.ayrton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaColecoes.adiciona(new Aula("Criando uma aula",20));
        javaColecoes.adiciona(new Aula("Modelando com coleções",24));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        //Lançaria a exception: UnsupportedOperationException, visto que o getAulas retorna uma lista imutável
        //Collections.sort(aulasImutaveis);

        /* A solução seria passar a lista que deseja modificar no construtor do método Arraylista e atribuir o resultado
        * a uma lista */
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);

        //System.out.println(javaColecoes.getTempoTotal());
        System.out.println(javaColecoes.getTempoTotal());

        /* 3 formas de conseguir pegar o tempo total dos cursos
        *
        * 1° criar uma atributo e cada vez que o método adicionar for acionado, este atributo acumula o tempo, ou seja,
        * tTotal+=getTempo();
        *
        * 2° Criar um método específico que através de um for acumule o tempo das aulas e retorne o tempo total;
        *
        * 3° Também através de um método, porém utilizando o recurso do Java 8: return this.aulas.stream().mapToInt(Aula::getTempo).sum();
        * */

        System.out.println(javaColecoes);
    }
}
