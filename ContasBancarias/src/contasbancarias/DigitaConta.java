
package contasbancarias;

import java.util.Scanner;

/**
 *
 * @author Raphael Westim Leite do Carmo
 */
public class DigitaConta {

    public static void main(String[] args) {
        
        ContaPoupanca cp = new ContaPoupanca();
        ContaCorrente contac = new ContaCorrente();
        
        Scanner tc = new Scanner(System.in);
    
        
        do{
            System.out.println("\n Digite sua Conta Poupanca \n");
            System.out.print("Digite o numero da conta: ");
            cp.numeroConta = tc.nextInt();
            
            if(cp.numeroConta != 0){
                System.out.print("Digite o numero do Cliente: ");
                cp.numeroCliente = tc.nextInt();  
                System.out.print("Digite data de abertura: ");
                cp.dataAbertura = tc.next();   
                System.out.print("Digite data de Aniversario: ");
                tc.nextLine();
                cp.dastasAniversario = tc.nextLine();  
                //System.out.println("Os dados Digitados foram----------- " + "Conta: " + cp.numeroConta + " Cliente: " + cp.numeroCliente + " Data de abertura: " + cp.dataAbertura );  
                System.out.print("Digite o valor do deposito: ");
                cp.depositoConta(tc.nextDouble());
                //System.out.print("agora o saldo e: " + cp.saldo);
                System.out.print("Digite o valor do saque: ");
                cp.saqueConta(tc.nextDouble());
                System.out.println("agora o saldo e: " + cp.saldo); 

                //-------------------------------------------------------------------

                System.out.println("\n Digite sua Conta Corrente \n");        
                System.out.print("Digite o numero da conta: ");
                contac.numeroConta = tc.nextInt();        
                System.out.print("Digite o numero do Cliente: ");
                contac.numeroCliente = tc.nextInt();       
                System.out.print("Digite data de abertura: ");
                contac.dataAbertura = tc.next();       
                System.out.print("Digite codigo do Gerente: ");
                contac.gerente = tc.nextInt();       
                System.out.print("Limite de Credito: ");
                contac.limite = tc.nextDouble();        
                System.out.print("valor taxa mensal ");
                contac.taxaMensal = tc.nextDouble();        
                System.out.print("Digite o valor do deposito: ");
                contac.depositoConta(tc.nextDouble());

                //System.out.print("agora o saldo e: " + contac.saldo);

                System.out.print("Digite o valor do saque: ");
                contac.saqueConta(tc.nextDouble());
                System.out.print("agora o saldo e: " + contac.saldo);
            }
            
        }while(cp.numeroConta != 0);

        
        
        
        
        
        
    }
    
}
