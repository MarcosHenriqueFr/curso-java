package lambdas;

abstract class Cliente {
    public abstract void depositar(double valor);
    public abstract double getSaldo();
}

interface ClienteUtil {
    String getDados(Cliente c);
}

public class Interfaces {
    public static void main(String[] args) {

        //Pede que reescreva pois é abstrato
        Cliente p1 = new Cliente() {
            double saldo = 1000;

            @Override
            public void depositar(double valor) {
                this.saldo += valor;
            }

            @Override
            public double getSaldo() {
                return saldo;
            }
        };

        //Geralmente são métodos estáticos
        ClienteUtil Utilidades = (Cliente cliente) -> {
            return String.format("O cliente possui R$%.2f de saldo!", cliente.getSaldo());
        };

        p1.depositar(789.86);
        System.out.println(p1.getSaldo());
        System.out.println(Utilidades.getDados(p1));
    }
}
