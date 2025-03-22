package classe.aninhada;

//Não preciso dar acesso a tudo para o usuario
public class Inners {

    public static void main(String[] args) {
        //Tenho que instanciar a partir de outra instancia, por isso tenho acesso

        Fora fora = new Fora();
        Fora.Dentro dentro = fora.new Dentro();
        dentro.mostrarTexto();
        fora.colocarValor(3);
    }
}

class Fora {

    //Conceito de shadowing
    private String texto = "Privado?";

    class Dentro {
        //Menor escopo maior prioridade
        private String texto = "Estou dentro";

        public void mostrarTexto(){
            //Tenho acesso porque preciso instanciar essa classe a partir da de fora
            System.out.println("Valor de fora: " + Fora.this.texto);
            System.out.println("Valor de dentro: " + texto);
        }
    }

    //Minha instancia morre mas a classe não
    private class Teste {
        public int num = 0;
    }

    public void colocarValor(int num){
        Teste t = new Teste();
        t.num = num;
        System.out.println("Valor da classe privada" + t.num);
    }
}
