package javaBasico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#,##0.00");
        float media = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Sistema de identificação de consumo de combustivel \n Por favor indique a distancia percorrida pelo automovel em km:");
        float a = entrada.nextFloat();
        System.out.println("Agora nos informe a quantidade de combustivel em litros:");
        float b = entrada.nextFloat();
        media = (a / b);
        System  .out.println("A media de Combustivel consumido pelo seu veiculo equivale a " + format.format(media) + "km/l (quilometro por litro)");

    }
}
