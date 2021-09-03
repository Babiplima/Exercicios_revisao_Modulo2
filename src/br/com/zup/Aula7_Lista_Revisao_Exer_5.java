package br.com.zup;

public class Aula7_Lista_Revisao_Exer_5 {

    //6 - Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

    public static void main(String[] args) {

        int contador = 1;

        while (contador <= 50) {
            if (contador % 2 != 0) {
                System.out.println("Este números são impares " + contador);
            }
            contador++;
        }

    }
}
