package classes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {

        List<String> validacao = new ArrayList<>();
        validacao.add("admin:admin@123");
        validacao.add("bruce:bruce@456");
        validacao.add("batman:batman@789");

        Transacao t = new Transacao();
        Cliente cliente = new Cliente("Bruce Wayne", "123.456.789-00");
        Conta conta;

        int tipo = 1;

        if (tipo == 1) {
            conta = new Conta(123456, cliente, 5000000.0f, null);
        } else {
            Especial especial = new Especial(700000.0f, 12);
            conta = new Conta(123456, cliente, 700000.0f, especial);
        }

        float saldoAnterior = conta.getSaldo();

        t.realizarTransacao("28/05/2023", conta, "Pagamento de Fatura", 10200.0f, Movimento.SACAR);
        t.realizarTransacao("01/06/2023", conta, "Recebimento de Salário", 24000.0f, Movimento.DEPOSITAR);
        t.realizarTransacao("03/06/2023", conta, "Compra em Carrefour", 2400.0f, Movimento.SACAR);

        System.out.println("Saldo Inicial: " + saldoAnterior);
        System.out.println("Saldo Atual: " + conta.getSaldo());

        try {
            char op;
            boolean flag = true;
            for (int i = 0; i < 3; i++) {
                op = JOptionPane.showInputDialog("Deseja emitir relatório? (s/n)").charAt(0);
                if (op == 's' || op == 'S') {
                    String usuario = JOptionPane.showInputDialog("Entre com o usuário");
                    String senha = JOptionPane.showInputDialog("Entre com a senha");

                    if (Validacao.validarUsuarioSenha(usuario, senha, validacao)) {
                        flag = false;
                        emitirRelatorio(conta, t);
                        break;
                    }
                    if (flag) {
                        throw new Restricao(0.0f, 0.0f);
                    }
                    break;
                } else if (op == 'n' || op == 'N') {
                    JOptionPane.showMessageDialog(null, "Encerrando programa");
                    break;
                } else {
                    if (i == 2) {
                        op = JOptionPane.showInputDialog("Deseja redefinir usuário e senha? (s/n)").charAt(0);
                        if (op == 's' || op == 'S') {
                            redefinirUsuarioSenha(validacao);
                        }
                    }
                }
            }
        } catch (Restricao r) {
            JOptionPane.showMessageDialog(null, r.toString(), "RESTRIÇÃO DE IDENTIFICAÇÃO", 1);
        }
    }

    private static void emitirRelatorio(Conta conta, Transacao transacao) {
        String texto = "Emitindo Extrato da Conta de Número: " + conta.getNumero() +
                "\n\nCorrentista: " + conta.getCorrentista().getNome() + "\nCPF: " + conta.getCorrentista().getCpf() +
                "\nSaldo Anterior: " + conta.getSaldo() + "\n\n";
        for (Movimento mov : transacao.getMovimentos()) {
            texto += "........................................\nData: " + mov.getData() +
                    "\nHistórico: " + mov.getHistorico() + "\nValor: " + mov.getValor() +
                    "\nOperação: " + (mov.getOperacao() == Movimento.DEPOSITAR ? "Depósito" : "Saque") + "\n";
        }
        texto += "\nSaldo Atual: " + conta.getSaldo();
        JOptionPane.showMessageDialog(null, texto, "Conta Nubank Oficial", 1);
    }

    private static void redefinirUsuarioSenha(List<String> validacao) {
        String novoUsuario = JOptionPane.showInputDialog("Entre com o novo usuário");
        String novaSenha = JOptionPane.showInputDialog("Entre com a nova senha");
        if (validarSenha(novaSenha)) {
            for (int i = 0; i < validacao.size(); i++) {
                if (validacao.get(i).startsWith(novoUsuario + ":")) {
                    validacao.set(i, novoUsuario + ":" + novaSenha);
                    JOptionPane.showMessageDialog(null, "Senha redefinida com sucesso!", "SUCESSO", 1);
                    return;
                }
            }
            validacao.add(novoUsuario + ":" + novaSenha);
            JOptionPane.showMessageDialog(null, "Usuário e senha adicionados com sucesso!", "SUCESSO", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Sua senha deve conter pelo menos 6 caracteres, incluindo " +
                    "um caracter especial ($ # @) e pelo menos 1 dígito de 0 a 9.", "ERRO", 0);
        }
    }

    private static boolean validarSenha(String senha) {
        return senha.length() >= 6 && senha.matches(".*[$#@].*") && senha.matches(".*\\d.*");
    }
}
