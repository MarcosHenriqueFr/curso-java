package binding;

public class TesteBinding {
    public static void main(String[] args) {
        //Dinamicamente o cachorro na classe animal
        Animal a1 = new Cachorro();
        Animal a2 = new Animal("Pássaro");

        //Runtime
        Animal.AtividadeAnimal.comer(a1); //passo o cachorro dinamicamente
        Animal.AtividadeAnimal.comer(a2);

        //uso de estaticos, poderia ter colocado os valores de som dentro da minha classe animal ou cachorro
        a1.fazerBarulho("Au Au");
        a2.fazerBarulho("Piu piu", 3);

        //Faz uma escolha estática e pula sozinho - no tempo do compilador
        Animal.pular(a1);
        Animal.pular(a2);

        System.out.println(a1.getNome());
        System.out.println(a2.getNome());
    }
}
