package javaBasico;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor total da compra:");
        float valor = entrada.nextFloat();
        float parcela = valor / 5;
        System.out.println("Sua compra ficou em 5 parcelas de " + parcela + "R$ cada.");
    }
}
