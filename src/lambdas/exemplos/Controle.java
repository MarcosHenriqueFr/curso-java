package lambdas.exemplos;

import java.util.List;
import java.util.ArrayList;

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

    // Muito restrito
    public void printPessoaMaisVelha(int idade){
        for(Pessoa p: lista){
            if(p.getIdade() > idade){
                p.printPessoa();
            }
        }
    }
}
