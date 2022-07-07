package javaBasico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#,##0.00");
        String[] arrayCarro = {"Camaro", "Audi  ", "Fusca", "Civic", "Uno  "};
        Integer[] arrayAno = {2008, 2004, 1985, 2010, 1998};
        Double[] arrayValor = {100000.00, 80000.00, 15000.00, 18000.00, 10000.00};
        double valorDesconto = 0, valorCarroDesconto = 0;
        System.out.println("====================================================");
        System.out.println("===== BEM VINDO A CONCESSIONARIA CARANGO VELHO =====");
        System.out.println("====================================================");
        System.out.println("Escolha qual dos nossos veiculos vc deseja comprar:");
        System.out.println("----------------------------------------------------");
        System.out.println("  Carro \t\t Ano \t\t Valor");

        for (int i = 0; i < arrayCarro.length; i++) {
            System.out.println((i + 1) + "- " + arrayCarro[i] + "\t\t" + arrayAno[i] + "\t\t" + arrayValor[i]);

        }
        System.out.println("----------------------------------------------------");
        System.out.println("Inserir valor do carro desejado:");
        byte escolha = entrada.nextByte();
        if (arrayAno[escolha - 1] < 2000) {
            valorDesconto = arrayValor[escolha - 1] * 0.12;
        }else {
            valorDesconto = arrayValor[escolha - 1] * 0.07;
        }
        System.out.println("Deseja aplicar o desconto?");
        entrada.nextLine();
        String opcao = entrada.nextLine();
        while (opcao.equalsIgnoreCase("s")) {
            valorCarroDesconto = arrayValor[escolha - 1] - valorDesconto;
            System.out.println("Deseja continuar calculando desconto?");
            opcao = entrada.nextLine();
        }
        System.out.println("O valor do " + (arrayCarro[escolha -1]) + " é igual a " + format.format(arrayValor[escolha - 1]) + "\n" +
                "O valor do desconto a ser aplicado é igual a " + format.format(valorDesconto) + "\n" +
                "O valor do carro com os descontos aplicados é igual a " + format.format(valorCarroDesconto));


    }
}
