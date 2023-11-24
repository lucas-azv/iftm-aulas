import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        // Solicitar informações da conta
        String nomeCliente = JOptionPane.showInputDialog("Informe o nome do correntista:");
        String cpfCliente = JOptionPane.showInputDialog("Informe o CPF do correntista:");
        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta:"));
        float saldoInicial = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo inicial da conta:"));
        Conta conta = new Conta(numeroConta, cliente, saldoInicial);
        Transacao transacao = new Transacao();

        // Recuperar saldo anterior
        float saldoAnterior = conta.getSaldo();

        // Menu de opções
        int opcao;
        do {
            String menu = "Conta Nubank oficial\n\n" +
                    "1. Realizar Depósito\n" +
                    "2. Realizar Saque\n" +
                    "3. Ver Extrato\n" +
                    "0. Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    realizarDeposito(transacao, conta);
                    break;
                case 2:
                    realizarSaque(transacao, conta);
                    break;
                case 3:
                    exibirExtrato(cliente, saldoAnterior, conta.getSaldo(), Movimento.getHistorico());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }

    private static void realizarDeposito(Transacao transacao, Conta conta) {
        LocalDate dataAtual = LocalDate.now();
        String data = dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do depósito:"));
        String historico = "Depósito";
        int operacao = Movimento.DEPOSITAR;

        if (transacao.realizarTransacao(data, conta, valor, historico, operacao)) {
            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao realizar o depósito.");
        }
    }

    private static void realizarSaque(Transacao transacao, Conta conta) {
        LocalDate dataAtual = LocalDate.now();
        String data = dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do saque:"));
        String historico = "Saque";
        int operacao = Movimento.SACAR;

        if (transacao.realizarTransacao(data, conta, valor, historico, operacao)) {
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao realizar o saque.");
        }
    }

    private static void exibirExtrato(Cliente cliente, float saldoAnterior, float saldoAtual, String historico) {
        JOptionPane.showMessageDialog(null, "Emitindo Extrato da Conta Comum Número: " + cliente.getCpf() + "\n" +
                "Correntista: " + cliente.getNome() + "\n" +
                "Saldo Anterior: R$" + saldoAnterior + "\n" +
                "Saldo Atual: R$" + saldoAtual + "\n" +
                "Histórico de Transações:\n" + historico);
    }
}
