package javaBasico;

import java.util.Random;

public class Exercicio18 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] arrayNome = new String[75];
        Integer[] arrayIdade = new Integer[75];
        int maiorIdade = 0;
        int menorIdade = 0;

        for (int i = 0; i < arrayIdade.length; i++) {
            arrayNome[i] = "Pessoa" + (i + 1);
            arrayIdade[i] = random.nextInt(100);

        }
        for (int i = 0; i < arrayNome.length; i++) {
            if (arrayIdade[i] < 18) {
                System.out.println(arrayNome[i] + " é menor de idade");
                menorIdade++;

            }else {
                System.out.println(arrayNome[i] + " é maior de idade");
                maiorIdade++;
            }

        }
        System.out.println(menorIdade + " são menores de idade. \n" + maiorIdade + " são maiores de idade.");

    }
}
