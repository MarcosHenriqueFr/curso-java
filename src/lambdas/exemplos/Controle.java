package lambdas.exemplos;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Controle {

    List<Pessoa> lista = new ArrayList<>();

    public Controle(){

    }

    public boolean adicionarPessoa(Pessoa pessoa){
        //Poderia ser uma exception
        if(pessoa == null){
            System.out.println("Valor nulo");
            return false;
        } else if(pessoa.getIdade() < 18 || pessoa.getIdade() > 120){
            System.out.println("Idade inválida");
            return false;
        }

        lista.add(pessoa);
        return true;
    }

    // Qualquer metodo de checagem que eu decida implementar com uma interface
    public void printPessoasComPredicate(Predicate<Pessoa> tester){
        for(Pessoa pessoa: lista){
            if(tester.test(pessoa)){
                pessoa.printPessoa();
            }
        }
    }
}
