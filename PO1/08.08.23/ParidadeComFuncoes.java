
import javax.swing.JOptionPane;

public class ParidadeComFuncoes {
    // Função que lê um número inteiro
    public static int lerNumero() {
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");
        int num = Integer.parseInt(input);
        return num;
    }

    // Função que sinaliza uma violação de restrição
    public static void sinalizarViolacao() {
        JOptionPane.showMessageDialog(null, "Você violou uma restrição!");
    }

    // Função que exibe a paridade
    public static void exibirParidade(int numero) {
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar.");
        }
    }

    // Função que verifica a paridade
    public static boolean verificarParidade(int numero) {
        return numero % 2 == 0;
    }

    // Função principal
    public static void main(String[] args) {
        int numero = lerNumero();

        if (verificarParidade(numero)) {
            exibirParidade(numero);
        } else {
            sinalizarViolacao();
        }
    }
}
