package br.com.zup;

import java.util.Scanner;

public class Main {
    //Enunciado: Faça um programa que pergunte o preço de três produtos e
    // informe qual produto você deve comprar,
    // sabendo que a decisão é sempre pelo mais barato.

    public static void main(String[] args) {

        //Instanciando o Scanner leitor

        Scanner leitor = new Scanner(System.in);

        //Variáveis

        int lista[]={0,1,2};
        // Condições

        //Pedindo valores do usuário

        for (int i = 0; i < 3; i++) {
            System.out.println("Por favor, digite o valor  ");
            lista[i] = leitor.nextInt();
        }

        //Comparando valores para achar o menor

        if (lista[1] < lista[0] & lista[1] < lista[2] ) {

            System.out.println("Este é o produto mais barato R$ " + lista[1]);
        }
        else if (lista[0] < lista[1] & lista[0] < lista[2] ){
            System.out.println("Este é o produto mais barato R$ " + lista[0]);
        }
        else {
            System.out.println( "Este é o produto mais barato R$ " + lista[2]);
        }
  }
}
