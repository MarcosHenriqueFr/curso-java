package lambdas.exemplos;

import java.time.LocalDate;

public class TesteControle {
    public static void main(String[] args) {
        Controle c = new Controle();

        LocalDate ani1 = LocalDate.of(2015, 3, 21);
        LocalDate ani2 = LocalDate.of(2001, 4, 1);
        LocalDate ani3 = LocalDate.of(1996, 8, 17);
        LocalDate ani4 = LocalDate.of(1943, 1, 8);
        Pessoa p1 = new Pessoa("Manoel", ani1, Pessoa.Sex.MALE, "a@aa.com");
        Pessoa p2 = new Pessoa("Clarice", ani2, Pessoa.Sex.FEMALE, "b@bb.com");
        Pessoa p3 = new Pessoa("Juliana", ani3, Pessoa.Sex.FEMALE, "c@cc.com");
        Pessoa p4 = new Pessoa("Ismael", ani4, Pessoa.Sex.MALE, "Ismael@dd.com");

        c.adicionarPessoa(p1); //Invalido porque tem menos de 18 anos
        c.adicionarPessoa(p2);
        c.adicionarPessoa(p3);
        c.adicionarPessoa(p4);

        c.printPessoaMaisVelha(25);
        System.out.println();

        for (Pessoa p: c.lista){
            p.printPessoa();
        }
    }
}
