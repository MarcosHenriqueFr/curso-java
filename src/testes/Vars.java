package testes;

import java.util.Scanner;

public class Vars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Somente recebe strings
        for(int i = 0; i < 5; i++){
            System.out.print("Digite um valor: ");
            var valor = scan.nextLine();
            System.out.println(valor);
        }
    }
}
