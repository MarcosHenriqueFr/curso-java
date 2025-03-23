package enums.iteracoes;

import java.util.Scanner;

public class Teste {

    //Usando for each em um enum
    public static void main(String[] args) {
        //for(Dias dia: Dias.values()){
        //    System.out.println(dia);
        //}

        //Ele mostra o texto
        //System.out.println(Dias.QUA);
        Scanner scan = new Scanner(System.in);
        String numStr = "";
        int numInt = 0;

        do {
            try {
                System.out.println("Digite um número: ");
                numStr = scan.nextLine();
                numInt = Integer.parseInt(numStr);
            } catch (NumberFormatException e){
                System.out.println("Erro: " + e.getMessage());
            }
        } while(numInt > 7 || numInt < 1);

        Dias diaPedido = Dias.deID(numInt);
        System.out.println(diaPedido);

        scan.close();
    }
}

enum Dias {
    DOM(1),
    SEG(2),
    TER(3),
    QUA(4),
    QUI(5),
    SEX(6),
    SAB(7);

    private final int diaID;
    Dias(int diaID){
        this.diaID = diaID;
    }

    //Mapeia os elementos dentro de enum e retorna ele
    public static Dias deID(int id) {
        for (Dias dia: Dias.values()) {
            if (dia.getDiaID() == id) {
                return dia;
            }
        }
        return Dias.DOM;
    }

    public int getDiaID() {
        return diaID;
    }
}
