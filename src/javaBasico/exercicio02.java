package javaBasico;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int resultado = 0;
        boolean valido = true;
        System.out.println("Digite um numero.");
        int a = entrada.nextInt();
        System.out.println("Digite outro valor.");
        int b = entrada.nextInt();
        System.out.println("Escolha qual operação matematica a ser feita, digite : \n 1 para adição \n 2 para subtração \n 3 para multiplicação \n 4 para divisão");
        byte escolha = entrada.nextByte();

        switch (escolha) {
            case 1:
            resultado = a + b;
            break;
            case 2:
            resultado = a - b;
            break;
            case 3:
            resultado = a * b;
            break;
            case 4:
            resultado = a / b;
            break;
            default:
                valido = false;
                System.out.println("Erro: Numero invalido digitado");
            break;

        }
        if (valido == true) {
            System.out.println("O resultado da conta é igual a: " + resultado);
        }
    }
}
