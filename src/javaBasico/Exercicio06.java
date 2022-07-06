package javaBasico;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe um valor numerico para a variavel A:");
        int a = entrada.nextInt();
        System.out.println("informe um valor numerico para a variavel B:");
        int b = entrada.nextInt();
        a =  a + b;
        b = a - b;
        a = a - b;
        System.out.println("A: " + a + "\n B: " + b);

    }
}
