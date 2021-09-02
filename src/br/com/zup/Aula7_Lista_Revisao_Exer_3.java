package br.com.zup;

import java.util.Scanner;

public class Aula7_Lista_Revisao_Exer_3 {
    public static void main(String[] args) {

        //Instanciando um Scanner

        Scanner leitor = new Scanner(System.in);

        //Declarando as variáveis

        int numeroDoUsuario;
        int numeroMultiplicado = 0;
        int contador = 0;


        //Pedindo o número ao usuário
        System.out.println("Por favor, insira o número a ser multiplicado");
        numeroDoUsuario = leitor.nextInt();

        // Apresentando qual tabuada será calculada

        System.out.println( "Tabuada de " + numeroDoUsuario);

        //Multiplicando a tabuada

        for (int aux = 1; aux <= 10; aux++)
            System.out.println(numeroDoUsuario + " x " + aux + " = " + numeroDoUsuario * aux);
    }



}




