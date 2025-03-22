package classe.aninhada;

//São definidas quando instanciadas
public class Anonimas {
    public static void main(String[] args) {
        //Muda e faz override no runtime

        //Não posso fazer isso pois forcei ele a ser abstrato e reescrito
        //SuperClasse instanciaA = new SuperClasse();

        //Como uma herança forçada, funciona com insterfaces e classes
        SuperClasse instanciaA = new SuperClasse() {

            @Override
            public void fazer() {
                System.out.println("Na Instância da classe");
            }
        };

        instanciaA.fazer();

        //Faz mais sentido em uma interface do que em uma classe
        ClassePai instanciaB = new ClassePai() {

            public void mostrar(){
                System.out.println("Feito na Instancia da Interface.");
            }
        };

        instanciaB.mostrar();
    }
}

abstract class SuperClasse {

    public void fazer(){
        System.out.println("Na SuperClasse!");
    }
}

interface ClassePai {
    void mostrar();
}
