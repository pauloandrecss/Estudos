package javaBasico;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Para fazermos a conversão nos informe o valor da cotação do dolar:");
        float cotacao = entrada.nextFloat();
        System.out.println("Agora nos informa a quantidade de dolares q você possui:");
        float valor = entrada.nextFloat();
        float real = valor * cotacao;
        System.out.println("Você contem com a cotação atual " + real + "R$");
    }
}
