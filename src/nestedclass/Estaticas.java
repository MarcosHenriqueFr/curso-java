package nestedclass;

class ClasseFora {

    static final int valorMulti = 4;

    //Static Nested Class
    public static class ClasseDentro {

        static int num1 = 1;
        final int num2;

        public ClasseDentro(int num2){
            this.num2 = num2;
        }

    }
}

//Consigo aplicar uma herança na classe de dentro
class Herdada extends ClasseFora.ClasseDentro {

    public Herdada() {
        super(2);
    }
}

//Só pode ter uma public original por classe
public class Estaticas {

    public static void main(String[] args) {
        ClasseFora.ClasseDentro instancia = new ClasseFora.ClasseDentro(2);
        Herdada instancia2 = new Herdada();

        int soma = ClasseFora.ClasseDentro.num1 + instancia.num2;
        int valorFinal = soma * ClasseFora.valorMulti;
        int valorHerdado = instancia2.num2;

        System.out.println("A soma é " + soma);
        System.out.println("O valor final é: "+ valorFinal);
        System.out.println(valorHerdado);
    }
}
