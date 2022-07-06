package javaBasico;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome do aluno:");
        String nome = entrada.nextLine();
        System.out.println("Inserir valor da prova de Matematica:");
        byte a = entrada.nextByte();
        System.out.println("Inserir valor da prova de Português:");
        byte b = entrada.nextByte();
        System.out.println("Inserir valor da prova de Ciências:");
        byte c = entrada.nextByte();
        System.out.println("O aluno " + nome + " obteve a media " + ((a + b + c) / 3) + " nas provas apresentadas." );
    }
}
