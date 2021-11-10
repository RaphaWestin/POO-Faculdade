
package contasbancarias;

public class TextaExemploClasses {

    public static void main(String[] args) {
        
        ContaPoupanca cp = new ContaPoupanca(); // incovando o primeiro construtor
        //ou
        ContaPoupanca cp2 = new ContaPoupanca("09/09/2019", 500.00); // incovando o segundo construtor
        //ou
        ContaPoupanca cp3 = new ContaPoupanca(10020, "09/08/2019", 800.00); // incovando o terceiro construtor
        
        cp3.saqueConta(200);
        //cp.depositoConta(5600
        System.out.print("Dados iniciais da Poupanca. N.Conta: " + cp3.numeroConta + " data abertura" + cp3.dataAbertura + " Saldo: " + cp3.saldo);
        //System.out.println("\n O saldo Conta poupanca e: " + cp.saldo);
        
        
        ContaCorrente contac = new ContaCorrente();
        contac.depositoConta(5400);
        System.out.println("\n O saldo Conta corrente e: " + contac.saldo);
        
        
        
        
        
    }
    
}
