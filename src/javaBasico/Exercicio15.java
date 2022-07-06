package javaBasico;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um numero:");
        int a = entrada.nextInt();
        if (a >= 100 && a <= 200) {
            System.out.println("O numero " + a + " se encontra no intervalo entre os numeros 100 e 200.");
        }else {
            System.out.println("O numero " + a + "  não se encontra no intervalo entre os numeros 100 e 200.");
        }
    }
}
