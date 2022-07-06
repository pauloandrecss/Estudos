package javaBasico;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio17 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<Integer>();
        int[] array = new int[80];
        for (int i = 0; i < 80; i++) {
            array[i] = random.nextInt(500);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10 && array[i] <= 150) {
                list.add(array[i]);
            }

        }

        System.out.println("Na coleção de numeros apresentada existem " + list.size() + " numeros entre 10 e 150.");

    }
}
