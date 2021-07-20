package classes;

public class Corrente extends Conta{

    public Corrente(int numero, Pessoa titular) {
        super(numero, titular);        
    }

    @Override
    public void sacar(Double valor) {        
            if(this.getSaldo() - (valor + 2) < 0){
                throw new IllegalArgumentException("Saldo insuficiente");
            }else{
                setSaldo(valor + 2);                
            }            
    }
    
}
