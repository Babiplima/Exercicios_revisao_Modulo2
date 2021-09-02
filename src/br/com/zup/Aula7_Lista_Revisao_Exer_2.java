package br.com.zup;

import java.util.Scanner;

public class Aula7_Lista_Revisao_Exer_2 {
    public static void main(String[] args) {

        //Instanciando o Scanner
        Scanner leitor = new Scanner(System.in);
        //Apresentando ao usuário Dias da semana e número do dia

        System.out.println("Digite o valor desejado da semana : ");
        System.out.println(" 1 - Domingo ");
        System.out.println(" 2 - Segunda ");
        System.out.println(" 3 - Terça ");
        System.out.println(" 4 - Quarta ");
        System.out.println(" 5 - Quinta ");
        System.out.println(" 6 - Sexta ");
        System.out.println(" 7 - Sábado ");

        //Variáveis

        String numeroDaSemana;

        int valorDadosPeloUsuario = 0;
        String um = "domingo";
        String dois = "segunda";
        String tres = "terça";
        String quatro = "quarta";
        String quinto = "quinta";
        String sexto = "sexta";
        String setimo = "sábado";

        //Pedindo para o usuário os números e tomando a decisão

        System.out.println(" Inserir o número do dia da semana ");
        int valorDadoPeloUsuario = leitor.nextInt();
        if (valorDadoPeloUsuario == 1) {
            System.out.println("O dia da semana " + um);
        } else if (valorDadoPeloUsuario == 2) {
            System.out.println("O dia da semana " + dois);
        } else if (valorDadoPeloUsuario == 3) {
            System.out.println("O dia da semana " + tres);
        } else if (valorDadoPeloUsuario == 4) {
            System.out.println("O dia da semana " + quatro);
        } else if (valorDadoPeloUsuario == 5) {
            System.out.println("O dia da semana " + quinto);
        } else if (valorDadoPeloUsuario == 6) {
            System.out.println("O dia da semana " + sexto);
        } else if (valorDadoPeloUsuario == 7) {
            System.out.println("O dia da semana " + setimo);
        }
    }
}








