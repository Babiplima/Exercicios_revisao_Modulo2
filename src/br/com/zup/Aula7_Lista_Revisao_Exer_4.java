package br.com.zup;

import java.util.Scanner;

public class Aula7_Lista_Revisao_Exer_4 {
    public static void main(String[] args) {

        //  Um número primo é divisível por 1 ou por ele mesmo

        //Instanciando o Scanner

        Scanner leitor = new Scanner(System.in);

        //Declarando variáveis

        int numPrimo;
        int numDivisores = 0;

        //Solicitando ao usuário o número

        System.out.print("Por favor, digite um número: ");

        numPrimo = leitor.nextInt();

        //Condições para decidir se é ou não um número primo

        for (int i = 1; i <= numPrimo; i++) {
            if (numPrimo % i == 0) {
                numDivisores++;
            }
        }
        if (numDivisores == 2)
            System.out.println(numDivisores + " É um número primo");
        else {
            System.out.println(" Não é um número primo.");
        }
    }
}







