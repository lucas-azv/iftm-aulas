import java.util.ArrayList;
import java.util.List;

public class Transacao {
    private List<Movimento> movimentos;

    public Transacao() {
        this.movimentos = new ArrayList<>();
    }

    public boolean realizarTransacao(String data, Conta conta, float valor, String historico, int operacao) {
        Movimento movimento = new Movimento(data, conta, historico, valor, operacao);
        if (movimento.movimentar()) {
            movimentos.add(movimento);
            return true;
        }
        return false;
    }

    public void estornarTransacao() {
        movimentos = new ArrayList<>();
    }

    public List<Movimento> getMovimentos() {
        return movimentos;
    }
}
