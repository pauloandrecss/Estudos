package javaBasico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor insira seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Informe o seu salário fixo:");
        float salario = entrada.nextFloat();
        System.out.println("Informe o numero total de vendas efetuadas neste mês (em dinheiro):");
        float vendas = entrada.nextFloat();
        System.out.println("Vendedor: " + nome + "\n Salario fixo: " + format.format(salario) + "R$" + "\n Seu salário somado as suas comições de vendas no mês: " + format.format(salario + (vendas * 0.15)) + "R$");


    }
}
