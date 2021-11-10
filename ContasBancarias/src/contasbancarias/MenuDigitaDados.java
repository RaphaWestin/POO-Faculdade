package contasbancarias;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MenuDigitaDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        int opcao = 5;
        
        while(opcao != 0){
            System.out.print("Escolha <1> para Poupanca <2> para Conta Corrente e <0> para sair: ");
            opcao = tc.nextInt();
            
            if (opcao == 1) {
                ContaPoupanca cp = new ContaPoupanca();
                
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
            } // fim if 1
            if (opcao == 2) {
                ContaCorrente contac = new ContaCorrente();
                System.out.println("\n Digite sua Conta Corrente \n");    
                
                do{
                    System.out.print("Digite o numero da conta: ");
                    contac.numeroConta = tc.nextInt();   
                }while(contac.numeroConta == 0);
                     
                
                do{
                    System.out.print("Digite o numero do Cliente: ");
                    contac.numeroCliente = tc.nextInt(); 
                }while(contac.numeroCliente == 0);
                      
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
            } // fim do if 2
            
            if (opcao != 0 && opcao != 1 && opcao != 2) {
                //System.out.println("Digite apenas os numeros indicados! <1>,<2> ou <0>");
                JOptionPane.showMessageDialog(null, "Digite Apenas os numeros Indicados!!");
            }
    
        }
        System.out.println("Fim do Programa!");
        
    } // chave do main
    
} // chave da classe DigitaConta
