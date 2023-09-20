import javax.swing.JOptionPane;

public class App {
    
    public static JogadorDeFutebol leDados(){

        String nome = JOptionPane.showInputDialog("Digite o nome do jogador:");
        String nacionalidade = JOptionPane.showInputDialog("Digite a nacionalidade do jogador:");
        String posicao = JOptionPane.showInputDialog("Digite a posição do jogador:");
        int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do jogador:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do jogador (em metros):"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do jogador (em kg):"));

        return new JogadorDeFutebol(nome, nacionalidade, posicao, anoNasc, altura, peso);
    }

    public String calculaAposentadoria(int idade, String posicao, String nome) {
        int aposentadoria = 0;
        String mensagem = "";

        switch (posicao.toLowerCase(null)) {
            case "ataque":
                aposentadoria = 35 - idade;
                break;

            case "meio":
                aposentadoria = 38 - idade;
                break;

            case "defesa":
                aposentadoria = 40 - idade;
                break;

            default:
                mensagem = "insira uma posição válida para o jogador";
                break;
                
        }
        return "Faltam" + aposentadoria + " anos para o jogador" + nome + " se aposentar.";
    }
    public static void main(String[] args) {
        
    }
}
