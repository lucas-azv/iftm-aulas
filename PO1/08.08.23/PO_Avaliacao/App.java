import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class App {
    public static Pessoa lePessoa() {
        String nome = JOptionPane.showInputDialog("Digite o nome:");
        char sexo = JOptionPane.showInputDialog("Digite o sexo (M/F):").charAt(0);
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
        return new Pessoa(nome, sexo, idade);
    }

    public static Formacao leFormacao() throws ParseException {
        String nivel = JOptionPane.showInputDialog("Digite o nível:");
        boolean concluido = JOptionPane.showInputDialog("Foi concluído? (S/N):").equalsIgnoreCase("S");
        String instituicao = JOptionPane.showInputDialog("Digite a instituição:");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date data = dateFormat.parse(JOptionPane.showInputDialog("Digite a data de conclusão (dd/MM/yyyy):"));
        return new Formacao(nivel, concluido, instituicao, data);
    }

    public static void main(String[] args) throws ParseException {
        Pessoa pessoa = lePessoa();
        Formacao formacao = leFormacao();

        String infoPessoa = pessoa.exibe();
        String infoFormacao = formacao.exibe();

        JOptionPane.showMessageDialog(null, "Informações da Pessoa:\n" + infoPessoa);
        JOptionPane.showMessageDialog(null, "Informações da Formação:\n" + infoFormacao);

        pessoa = atualizaIdade(pessoa);
        formacao = atualizaStatus(formacao);

        String infoPessoaAtualizada = pessoa.exibe();
        String infoFormacaoAtualizada = formacao.exibe();

        JOptionPane.showMessageDialog(null, "Informações da Pessoa Atualizadas:\n" + infoPessoaAtualizada);
        JOptionPane.showMessageDialog(null, "Informações da Formação Atualizadas:\n" + infoFormacaoAtualizada);
    }

    public static Pessoa atualizaIdade(Pessoa pessoa) {
        int novaIdade = pessoa.getIdade() + 1;
        pessoa.setIdade(novaIdade);
        return pessoa;
    }

    public static Formacao atualizaStatus(Formacao formacao) {
        formacao.setConcluido(true);
        return formacao;
    }
}
