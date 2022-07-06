package javaBasico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#,##0.00");
        float precoFinal = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o preço de custo do produto:");
        float custo = entrada.nextFloat();
        System.out.println("Agora nos informe a porcentagem do produto q ira ser acrescentada ao preço final:");
        float acrescimo = entrada.nextFloat();
        precoFinal = custo + (custo * (acrescimo / 100));
        System.out.println("O preço final do prudo deve ser de " + format.format(precoFinal) + "R$");

    }
}
