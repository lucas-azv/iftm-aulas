package classes;

public class Restricao extends Exception {
    private float saque;
    private float saldo;

    public Restricao(float saque, float saldo) {
        this.saque = saque;
        this.saldo = saldo;
    }

    public float getSaque() {
        return saque;
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Saldo insuficiente";
    }
}
