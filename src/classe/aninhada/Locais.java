package classe.aninhada;

//Elas ficam dentro do métodos e morrem ao fim dele
//São non static por natureza, e aplicam as mesmas regras da inner
public class Locais {

    public static void main(String[] args) {
        CFora fora = new CFora();
        fora.mostrarTexto("Jorge");
    }
}

class CFora {

    public void mostrarTexto(String nome){

        class Pessoa {
            final String nome;

            public Pessoa(String nome){
                this.nome = nome;
            }

            @Override
            public String toString(){
                return String.format("Seu nome é: " + this.nome);
            }
        }

        Pessoa p1 = new Pessoa(nome);

        System.out.println(p1);

        //O objeto garbage collector
    }
}

