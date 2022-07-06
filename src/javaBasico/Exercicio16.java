package javaBasico;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome do aluno:");
        float media = 0;
        String nome = entrada.nextLine();
        System.out.println("Inserir valor da prova de Matematica:");
        float a = entrada.nextFloat();
        System.out.println("Inserir valor da prova de Português:");
        float b = entrada.nextFloat();
        System.out.println("Inserir valor da prova de Ciências:");
        float c = entrada.nextFloat();
        media =(a + b + c) / 3;
        System.out.println("O aluno " + nome + " obteve a media de " + media);
        if (media >= 7) {
            System.out.println("Situação aluno: APROVADO");
        }else if (media <= 5) {
            System.out.println("Situação aluno: REPROVADO");
        }else {
            System.out.println("Situação aluno: RECUPERAÇÃO");
        }
    }
}
