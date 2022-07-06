package javaBasico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#,##0.00");
        float impostos = (float) 0.45;
        float destribuidor= (float) 0.28;
        float valorFinal= 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o custo de fabricação do carro em questão:");
        float custo = entrada.nextFloat();
        valorFinal= custo + (custo * impostos);
        valorFinal= valorFinal + (valorFinal * destribuidor);
        System.out.println("O valor final do carro apos os impostos serem aplicados é: " + format.format(valorFinal) + "R$");


    }
}
