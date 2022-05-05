package br.com.ayrton;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteFuncionario {
    public static void main(String[] args) {

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenarFuncionarioPorIdade());
        funcionarios.add(new Funcionario("Ayrton",27));
        funcionarios.add(new Funcionario("Ana",58));
        funcionarios.add(new Funcionario("Alana",33));

        Iterator<Funcionario> iterator = funcionarios.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
