package ex01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exemplo1_static {
    Scanner s = new Scanner(System.in);

    public static void exibe(FichaPessoal pessoa){
        JOptionPane.showMessageDialog(null, "Informações da Pessoa:\n\n" + "nome: " + pessoa.getNome() + "\nidade: " + pessoa.getIdade());
    }
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));

        FichaPessoal ficha = new FichaPessoal(nome, idade);

        exibe(ficha);
    }
}
