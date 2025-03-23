package enums.classesdif;

import java.util.Scanner;

public class Menu {
    private final Scanner entrada = new Scanner(System.in);

    public Menu(){
        executarJogo();
    }

    private void executarJogo() {
        String op = "", nome;
        int opTratado = 0;
        Nivel nivel;
        Jogador jogador;

        System.out.print("Escreva seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Escolha um nível para continuar!");
        System.out.println("1. Fácil\n2.Médio\n3.Difícil");

        opTratado = validarValorDificuldade(op, opTratado);
        nivel = setarNivel(opTratado);
        jogador = criarJogador(nome, nivel);
        mostrarInfos(jogador);

        entrada.close();
    }

    private Nivel setarNivel(int opTratado) {
        //Enhanced switch a partir do Java 13
        return switch (opTratado) {
            case 1 -> Nivel.BAIXO;
            case 2 -> Nivel.MEDIO;
            case 3 -> Nivel.ALTO;
            default -> null;
        };
    }

    private Jogador criarJogador(String nome, Nivel nivel) {
        return new Jogador(nome, nivel);
    }

    private void mostrarInfos(Jogador jogador) {
        System.out.println(jogador);
    }

    private int validarValorDificuldade(String op, int opTratado) {
        do {
            System.out.print("Insira um valor: ");
            try {
                op = entrada.nextLine();
                opTratado = Integer.parseInt(op);
            } catch (RuntimeException e){
                e.getStackTrace();
            }

        } while (opTratado > 3 || opTratado < 1);

        return opTratado;
    }
}
