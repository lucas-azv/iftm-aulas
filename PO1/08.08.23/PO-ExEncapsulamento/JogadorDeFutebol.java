import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class JogadorDeFutebol {
    public String nome, nacionalidade, posicao;
    public int anoNasc;
    public double altura, peso;

    public JogadorDeFutebol(String nome, String nacionalidade, String posicao, int anoNasc, double altura,
            double peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.anoNasc = anoNasc;
        this.posicao = posicao;
        this.altura = altura;
        this.peso = peso;
    }

    public int calculaIdade() {

        Calendar dataAtual = Calendar.getInstance();
        int anoAtual = dataAtual.get(Calendar.YEAR);
        int idade = anoAtual - anoNasc;

        return idade;
    }

    public void exibeDados() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String mensagem = "Nome: " + nome + "\n";
        mensagem += "Data de Nascimento: " + dateFormat.format(anoNasc) + "\n";
        mensagem += "Altura: " + altura + " m\n";
        mensagem += "Peso: " + peso + " kg\n";
        mensagem += "Nacionalidade: " + nacionalidade + "\n";
        mensagem += "Posição: " + posicao;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
