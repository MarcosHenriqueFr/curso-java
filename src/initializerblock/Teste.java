package initializerblock;

public class Teste {
    public static void main(String[] args) {
        TesteFilho t =  new TesteFilho();
        new TesteFilho();
        System.out.println(TesteFilho.a);
        System.out.println(t.b);
        System.out.println(t.c);
    }
}

class TestePai {

    static int a;
    int b;

    static {
        a = 3;
        System.out.println("Initializer Block static da Classe pai");
    }

    {
        b = 5;
        System.out.println("Initializer Block do Objeto pai");
    }

    TestePai(){
        System.out.println("O Construtor do pai");
    }
}

class TesteFilho extends TestePai {

    int c;
    static {
        System.out.println("Inicializa os static do filho");
    }

    TesteFilho(){
        //Sempre passa por um super();
        System.out.println("Construtor do filho");
    }

    {
        c = 2;
        System.out.println("Inicializa os atributos do objeto filho");
    }
}
