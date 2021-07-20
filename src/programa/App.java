package programa;

import java.util.InputMismatchException;
import java.util.Scanner;

import classes.Conta;
import classes.Corrente;
import classes.Pessoa;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pessoa titular = new Pessoa("André", "213565168132");
        Conta conta = new Corrente(1234, titular);

        boolean continuar =true;
        while(continuar){
            try{ 
                conta.depositar(100.00);
                System.out.println("Informe o valor a ser sacado");
                Double valor = sc.nextDouble();
                sc.nextLine();
                conta.sacar(valor);                
            }catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }catch(InputMismatchException e){
                System.out.println("É necessário digitar um número");
            }

            System.out.printf("Saldo na conta: %f\n", conta.getSaldo());

            System.out.println("Deseja realizar uma nova movimentação? ");
            continuar = (sc.nextLine().toUpperCase().equals("S"));
        }        
        sc.close();
    }
}
