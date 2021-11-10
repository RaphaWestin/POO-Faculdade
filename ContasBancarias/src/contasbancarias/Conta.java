
package contasbancarias;

public class Conta { // Metodos
    int numeroConta;
    int numeroCliente;
    double saldo;
    String dataAbertura;
    
    void saqueConta(double valor){ // Atributos
        saldo -= valor; //saldo - valor
    }
    
    void depositoConta(double valor){
        saldo = saldo+valor;
    }
    
    Conta(){
        saldo = 250;
        dataAbertura = "01-09-2021";
    }
}
