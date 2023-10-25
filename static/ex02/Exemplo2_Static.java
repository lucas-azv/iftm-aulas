package ex02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exemplo2_Static {
    Scanner s = new Scanner(System.in);

    public static void exibe(FichaPessoal pessoa) {
        JOptionPane.showMessageDialog(null,
                "Informações da Pessoa:\n\n" + "nome: " + pessoa.getNome() + "\nidade: " + pessoa.getIdade() + "\npessoas cadastradas: " + pessoa.getQuantidade());
    }

    public static void main(String[] args) {
        do{
        String nome = JOptionPane.showInputDialog("Digite o nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));

        FichaPessoal ficha = new FichaPessoal(nome, idade);
        FichaPessoal.setQuantidade(FichaPessoal.getQuantidade()+1);
        exibe(ficha);

    }while(true);

    }
}
