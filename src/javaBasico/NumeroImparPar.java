package javaBasico;

import java.util.Scanner;

public class NumeroImparPar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = 0;
        while (a <= 0) {
            System.out.println("Informe um numero que sera informado se o mesmo é impar ou par:");
            a = entrada.nextInt();
            if (a <= 0) {
                System.out.println("Por favor tente novamente e informe um numero positivo valido.");
            } else if (a % 2 == 0) {
                System.out.println("O numero " + a + " é par.");
            } else {
                System.out.println("O numero " + a + " é impar.");
            }
        }
    }
}