package javaBasico;

import java.util.Scanner;

public class VerificarIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo a boate, por favor nos informe a sua idade");
        byte a = entrada.nextByte();
        if (a < 18 && a > 0) {
            System.out.println("Proibida entrada de menores de 18 anos.");
        } if (a <= 0) {
            System.out.println("Numero da idade informado é invalido.");
        } else {
            System.out.println("Seja bem vindo a nossa boate.");
            }

    }
}
