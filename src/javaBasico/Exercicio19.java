package javaBasico;

import java.util.Random;

public class Exercicio19 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] arrayNome = new String[56];
        String[] arraySexo = new String[56];
        byte masculino = 0;
        byte feminino = 0;
        byte x = 0;

        for (int i = 0; i < arrayNome.length; i++) {
            arrayNome[i] = "Pessoa" + (i + 1);
            x = (byte) random.nextInt(2);
            if (x == 1) {
                arraySexo[i] = "Masculino";
                masculino++;
            } else {
                arraySexo[i] = "Feminino";
                feminino++;
            }
        }
        for (int i = 0; i < arrayNome.length; i++) {
            System.out.println(arrayNome[i] + " é do sexo " + arraySexo[i]);

        }
        System.out.println("Total de " + masculino + " pessoas do sexo masculino. \n" +
                "Total de " + feminino + " pessoas do sexo feminino.");
    }
}
