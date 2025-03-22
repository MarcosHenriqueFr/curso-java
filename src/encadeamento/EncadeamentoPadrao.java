package encadeamento;

import java.util.Scanner;

public class EncadeamentoPadrao {

    //Aplicação do method chaining diretamente
    public static void main(String[] args) {
        String texto, textoFormat;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um texto: ");
        texto = entrada.nextLine();
        textoFormat = texto.trim().toUpperCase().concat("!!!");

        System.out.println("Aqui está seu texto formatado: " + textoFormat);

        entrada.close();
    }
}
