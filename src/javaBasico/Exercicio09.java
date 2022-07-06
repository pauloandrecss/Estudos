package javaBasico;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor depositado no banco:");
        int valor = entrada.nextInt();
        System.out.println("informe a quantidade de meses em que o valor ficou depositado:");
        byte mes = entrada.nextByte();
        System.out.println("O valor com rendimento contido na poupança apos" + mes + " meses a 0,07% ao mes é igual a:" + (valor + (valor*0.0007)));
    }
}
