
package contasbancarias;

public class ContaPoupanca extends Conta {
    String dastasAniversario;
    
    @Override       // reescrita de metodo -------> Polimorfismo
    void saqueConta(double valor){
        
        if ((saldo - valor) >= 0)
            saldo = saldo - valor;
        else
            System.out.println("ero no saque. Voce nao pode sacar este valor, tente novamente");
        
    }
    
    ContaPoupanca(){ // contrutor sem parametros
        
    }
    
    ContaPoupanca(String x, double y){ // contrutore com dois parametros
        dataAbertura = x;
        saldo = y;
    }
    
    ContaPoupanca(int numeroConta, String dataAbertura, double saldo){ // contrsutor com N parametros
        this.numeroConta = numeroConta;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }
    
}
