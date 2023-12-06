package classes;

import java.util.ArrayList;
import java.util.List;

public class Transacao {
    private List<Movimento> movimentos;

    public Transacao() {
        this.movimentos = new ArrayList<>();
    }

    public boolean realizarTransacao(String data, Conta conta, String historico, float valor, int operacao) {
        float saldoAnterior = conta.getSaldo();

        Movimento movimento = new Movimento(data, conta, historico, valor, operacao);
        boolean movimentacaoBemSucedida = movimento.movimentar();

        if (movimentacaoBemSucedida) {
            movimentos.add(movimento);
            return true;
        } else {
            System.out.println("Transação não autorizada.");
            return false;
        }
    }

    public boolean realizarTransacao(String data, Conta conta, Especial especial, String historico, float valor, int operacao) {
        float saldoAnterior = conta.getSaldo();

        Movimento movimento = new Movimento(data, conta, historico, valor, operacao);
        boolean movimentacaoBemSucedida = movimento.movimentar(especial);

        if (movimentacaoBemSucedida) {
            movimentos.add(movimento);
            return true;
        } else {
            System.out.println("Transação não autorizada.");
            return false;
        }
    }

    public void estornarTransacao() {
        List<Movimento> novosMovimentos = new ArrayList<>();

        for (Movimento mov : movimentos) {
            Movimento novoMovimento = new Movimento(mov.getData(), mov.getConta(), mov.getHistorico(), mov.getValor(), mov.getOperacao());
            novoMovimento.setSaldoAnterior(mov.getSaldoAnterior());
            novosMovimentos.add(novoMovimento);

            if (mov.getOperacao() == Movimento.SACAR) {
                mov.getConta().movimentar(mov.getValor(), Movimento.DEPOSITAR);
            } else {
                mov.getConta().movimentar(mov.getValor(), Movimento.SACAR);
            }
        }
        movimentos = novosMovimentos;
        }


    public List<Movimento> getMovimentos() {
        return movimentos;
    }
}
