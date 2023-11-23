public class Movimento {
    private String data;
    private Conta conta;
    private String historico;
    private float valor;
    private int operacao;
    private float saldoAnterior;

    public static final int SACAR = 0;
    public static final int DEPOSITAR = 1;

    public Movimento(String data, Conta conta, String historico, float valor, int operacao) {
        this.data = data;
        this.conta = conta;
        this.historico = historico;
        this.valor = valor;
        this.operacao = operacao;
        this.saldoAnterior = conta.getSaldo();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public float getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(float saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public boolean movimentar() {
        try {
            return conta.movimentar(valor, operacao);
        } catch (Restricoes e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

