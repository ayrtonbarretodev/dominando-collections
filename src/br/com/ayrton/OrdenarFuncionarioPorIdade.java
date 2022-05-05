package br.com.ayrton;

import java.util.Comparator;

public class OrdenarFuncionarioPorIdade implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario o1, Funcionario o2) {
        return Integer.compare(o1.getIdade(),o2.getIdade());
    }
}
