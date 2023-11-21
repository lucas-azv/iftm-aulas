import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        double saldo = 1000.00;
        double valorSaque = 0;

        String mensagem = "Conta Nubank(OFICIAL)\n\n Insira o valor que deseja sacar:";
        valorSaque = Double.parseDouble(JOptionPane.showInputDialog(null, mensagem));

        try {
            saque(saldo, valorSaque);
        } catch (IllegalArgumentException error) {
            System.err.println("███╗   ███╗ ██████╗ ██████╗ ██████╗  █████╗ \r\n" + //
                    "████╗ ████║██╔═══██╗██╔══██╗██╔══██╗██╔══██╗\r\n" + //
                    "██╔████╔██║██║   ██║██████╔╝██████╔╝███████║\r\n" + //
                    "██║╚██╔╝██║██║   ██║██╔══██╗██╔══██╗██╔══██║\r\n" + //
                    "██║ ╚═╝ ██║╚██████╔╝██║  ██║██║  ██║██║  ██║\r\n" + //
                    "╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝\r\n" + //
                    "                                           ");
        }
        JOptionPane.showMessageDialog(null, "Operação Finalizada");
    }

    public static void saque(double saldo, double valorSaque) throws Exception {
        if (valorSaque > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        } else {
            saldo -= valorSaque;
            JOptionPane.showMessageDialog(null, "Valor retirado da conta: R$" + valorSaque);
            System.out.println("Novo saldo: R$" + saldo);
        }
    }
}


/*
    faça um programa em java que leia do usuario o valor de um saque a ser feito na conta dele
    em seguida chame o metodo saque que ira verificar se é possivel sacar
    caso nao haja saldo suficiente, lance uma exceçao de argumento ilegal
    caso contrario, exiba uma mensagem informando que o saque foi realizado
    o tratamento dessa exceção sera feito no main
    considere saldo = 1000
*/

/*
 * Faça um programa em java que inicializa dois vetores
 * int [] num = {4,8,5,16,32,21,64,128,62,80,90};
 * int [] den = {2,0,4,8,0,2,4};
 * o programa devera dividir os elementos do vetor num pelos elementos do vetor den
 * poderá ocorrer mais de uma exceção
*/