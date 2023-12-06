package classes;

public class Conta {
    private int numero;
    private Cliente correntista;
    private float saldo;
    private Especial especial;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Cliente correntista) {
        this.correntista = correntista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Especial getEspecial() {
        return especial;
    }

    public void setEspecial(Especial especial) {
        this.especial = especial;
    }

    public Conta() {
    }

    public Conta(int numero, Cliente correntista, float saldo, Especial especial) {
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
        this.especial = especial;
    }

    public void depositar(float valor) {
        if (especial != null) {
            float taxa = especial.getLimite() > especial.defineTaxacao(valor) ? 0.0005f * valor : 0;
            this.saldo += valor - taxa;
        } else {
            this.saldo += valor;
        }
    }

    public void depositar(float valor, Especial outraEspecial) {
        if (outraEspecial != null) {
            float taxa = outraEspecial.getLimite() > outraEspecial.defineTaxacao(valor) ? 0.0005f * valor : 0;
            this.saldo += valor - taxa;
        } else {
            this.saldo += valor;
        }
    }

    public boolean sacar(float valor) {
        if (especial != null) {
            float taxa = especial.defineTaxacao(valor);
            if (this.saldo >= valor + taxa) {
                this.saldo -= valor + taxa;
                return true;
            } else {
                return false;
            }
        } else {
            float taxa = 0.005f * valor;
            if (this.saldo >= valor + taxa) {
                this.saldo -= valor + taxa;
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean sacar(float valor, Especial outraEspecial) {
        if (outraEspecial != null) {
            float taxa = outraEspecial.defineTaxacao(valor);
            if (this.saldo >= valor + taxa) {
                this.saldo -= valor + taxa;
                return true;
            } else {
                return false;
            }
        } else {
            float taxa = 0.005f * valor;
            if (this.saldo >= valor + taxa) {
                this.saldo -= valor + taxa;
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean movimentar(float valor, int operacao) {
        if (operacao == Movimento.SACAR) {
            if (valor <= saldo) {
                saldo -= valor;
                return true;
            } else {
                return false;
            }
        } else if (operacao == Movimento.DEPOSITAR) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean movimentar(float valor, int operacao, Especial especial){
        if(operacao==Movimento.SACAR){
            float taxa = especial.defineTaxacao(valor);
            if(valor+taxa<=saldo){
                saldo -= valor+taxa;
                return true;
            }
            else{
                return false;
            }
        }
        else if(operacao==Movimento.DEPOSITAR){
            saldo += valor;
            return true;
        }
        return false;
    }
}
