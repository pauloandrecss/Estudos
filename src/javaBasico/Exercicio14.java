package javaBasico;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int a = entrada.nextInt();
        System.out.println("Digite outro numero inteiro:");
        int b = entrada.nextInt();
        if (a > b) {
            System.out.println("O numero " + a + " é maior que o numero " + b);
        }else {
            System.out.println("O numero " + b + " é maior que o numero " + a);
        }
    }
}
