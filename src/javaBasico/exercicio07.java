package javaBasico;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor da temperatura em graus Celsius:");
        byte c = entrada.nextByte();
        int f = ((9 * c + 160) / 5);
        System.out.println("A temperatura atual é igual a: " + f + "°F (graus Fahrenheit)");

    }
}
