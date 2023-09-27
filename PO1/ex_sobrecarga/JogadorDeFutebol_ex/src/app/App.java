/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author aluno
 */
import java.util.Scanner;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JogadorDeFutebol jogador01 = leDados();

        System.out.println(jogador01.exibeJogador());

        System.out.println(verificaIdade(jogador01.posicao, jogador01.getNome(), jogador01.calculaIdade()));

    }

    public static JogadorDeFutebol leDados() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do Jogador: ");
        String nome = s.nextLine();
        System.out.println("Ano de nascimento do Jogador: ");
        int nascimento = s.nextInt();
        System.out.println("Altura do Jogador: ");
        double altura = s.nextDouble();
        System.out.println("Peso do Jogador: ");
        double peso = s.nextDouble();
        s.nextLine();
        System.out.println("Nacionalidade do Jogador: ");
        String nacionalidade = s.nextLine();
        System.out.println("Posicao do Jogador: ");
        String posicao = s.nextLine();

        JogadorDeFutebol jogador = new JogadorDeFutebol(nome, nascimento, altura, peso, nacionalidade, posicao);

        return jogador;
    }

    public static String verificaIdade(String posicao, String nome, int idade) {

        if (posicao.equals("atacante")) {

            int aposenta = 35 - idade;

            if (aposenta > 0) {
                return "Faltam " + aposenta + " anos para o jogador " + nome + " se aposentar";
            } else {
                return "Jogador aposentado.";
            }

        } else if (posicao.equals("defensor")) {

            int aposenta = 40 - idade;

            if (aposenta > 0) {
                return "Faltam " + aposenta + " anos para o jogador " + nome + " se aposentar";
            } else {
                return "Jogador aposentado.";
            }

        } else if (posicao.equals("meia")) {

            int aposenta = 38 - idade;

            if (aposenta > 0) {
                return "Faltam " + aposenta + " anos para o jogador " + nome + " se aposentar";
            } else {
                return "Jogador aposentado.";
            }

        } else {
            return "Não é jogador";
        }
    }
}
