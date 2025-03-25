package lambdas.exemplos;

import java.time.LocalDate;

public class TesteControle {
    public static void main(String[] args) {
        Controle c = new Controle();

        LocalDate ani1 = LocalDate.of(2015, 3, 21);
        LocalDate ani2 = LocalDate.of(2001, 4, 1);
        LocalDate ani3 = LocalDate.of(1996, 8, 17);
        LocalDate ani4 = LocalDate.of(1943, 1, 8);
        LocalDate  ani5 = LocalDate.of(2006, 4, 7);

        Pessoa p1 = new Pessoa("Manoel", ani1, Pessoa.Sex.MALE, "a@aa.com");
        Pessoa p2 = new Pessoa("Clarice", ani2, Pessoa.Sex.FEMALE, "b@bb.com");
        Pessoa p3 = new Pessoa("Juliana", ani3, Pessoa.Sex.FEMALE, "c@cc.com");
        Pessoa p4 = new Pessoa("Ismael", ani4, Pessoa.Sex.MALE, "Ismael@dd.com");
        Pessoa p5 = new Pessoa("Paola", ani5, Pessoa.Sex.FEMALE, "Paola@ee.com");

        c.adicionarPessoa(p1); //Invalido porque tem menos de 18 anos
        c.adicionarPessoa(p2);
        c.adicionarPessoa(p3);
        c.adicionarPessoa(p4);
        c.adicionarPessoa(p5);

        //Usando LAMBDAS Criadas
        System.out.println("Homens listados: ");
        c.printPessoasComPredicate(p -> p.getSexo() == Pessoa.Sex.MALE);
        System.out.println();

        //Usando Interfaces Funcionais já existentes
        System.out.println("Mulheres listadas: ");
        c.printPessoasComPredicate(pessoa -> pessoa.getSexo() == Pessoa.Sex.FEMALE);

        System.out.println("Mulheres com mais de 25 anos: ");
        c.printPessoasComPredicate(pessoa -> pessoa.getSexo() == Pessoa.Sex.FEMALE && pessoa.getIdade() > 25);
    }
}
