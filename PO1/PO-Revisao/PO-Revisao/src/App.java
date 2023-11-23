import javax.swing.JOptionPane;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Nome Cliente", "123.456.789-01");
        Conta conta = new Conta(1, cliente, 1000.0);

        Transacao transacao = new Transacao();

        try {
            float saldoAnterior = conta.getSaldo();

            transacao.realizarTransacao("2023-11-23", conta, 500.0, "Compra", Movimento.SACAR);
            transacao.realizarTransacao("2023-11-24", conta, 200.0, "Depósito", Movimento.DEPOSITAR);

            List<Movimento> movimentos = transacao.getMovimentos();

            String relatorio = "Relatório:\n" +
                               "Saldo anterior: " + saldoAnterior + "\n\n";

            for (Movimento movimento : movimentos) {
                relatorio += "Data: " + movimento.getData() + "\n" +
                             "Histórico: " + movimento.getHistorico() + "\n" +
                             "Valor: " + movimento.getValor() + "\n" +
                             "Saldo Anterior: " + movimento.getSaldoAnterior() + "\n" +
                             "Saldo Atual: " + movimento.getConta().getSaldo() + "\n\n";
            }

            JOptionPane.showMessageDialog(null, relatorio, "Relatório", JOptionPane.INFORMATION_MESSAGE);

        } catch (Restricoes e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
