package classes;

public class Especial {
    private float limite;
    private int tempo;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public Especial() {
    }

    public Especial(float limite, int tempo) {
        this.limite = limite;
        this.tempo = tempo;
    }

    public float defineTaxacao(float saldo) {
        if (tempo < 12 || (tempo >= 12 && tempo <= 23 && saldo <= 0)) {
            return 0.002f * saldo;
        } else if (tempo >= 12 && tempo <= 23 && saldo > 0) {
            return 0.0015f * saldo;
        } else if (tempo > 23 && saldo <= 0) {
            return 0.0015f * saldo;
        } else {
            return 0.001f * saldo;
        }
    }
}
