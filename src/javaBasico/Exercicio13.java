package javaBasico;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um numero:");
        int x = entrada.nextInt();
        if (x > 10) {
            System.out.println("O numero inserido é maior q 10.");
        }
    }
}
