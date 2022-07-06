package javaBasico;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int resultado = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um numero:");
        int a = entrada.nextInt();
        System.out.println("Agora informe outro valor:");
        int b = entrada.nextInt();
        resultado = a + b;
        System.out.println("A soma dos numeros " + a + " e " + b + " é igual a " + resultado + ".");
    }
}
