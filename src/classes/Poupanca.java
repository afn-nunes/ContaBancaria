package classes;

public class Poupanca extends Conta{
    private Double juros = 0.05;

    public Poupanca(int numero, Pessoa titular) {
        super(numero, titular);       
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }
    @Override
    public void depositar(Double valor){
        super.depositar( valor + (valor * juros));
    }

    @Override
    public void sacar(Double valor){
        if(this.getSaldo() - (valor) < 0){
            System.out.println("Saldo não disponível");
        }else{
           super.setSaldo(valor);
        }    
    }
}
