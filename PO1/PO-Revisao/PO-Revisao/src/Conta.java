public class Conta {
    private int numero;
    private Cliente correntista;
    private float saldo;
    
    public Conta(int numero, Cliente correntista, float saldo) {
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    public Conta(){

    }
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

    public void depositar(float valorDeposito){
        saldo += valorDeposito;
    }
    public boolean sacar(float valorSaque){
        if(valorSaque <= saldo){
            saldo -= valorSaque;
            return true;
        } else{
            return false;
        }
    }
    public boolean movimentar(float saldo, int numero){

        return false;
    }
}
