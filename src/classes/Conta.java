package classes;

public abstract class Conta{
    private int numero;
    private Double saldo = 0.0;
    private Pessoa titular;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Double getSaldo() {
        return saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }
    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }

    void setSaldo(Double valor){
        this.saldo -= valor;
    }

    public abstract void sacar(Double valor);


    public Conta(int numero, Pessoa titular) {
        this.numero = numero;
        this.titular = titular;
    }
    

}