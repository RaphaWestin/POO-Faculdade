
package projetoexemplo3;
//import java.lang.*;
import java.util.Scanner; // importacao de classe Scanner

/**
 *
 * @author Raphael Westim Leite do Carmo
 */
public class ProgramaTres {

    public static void main(String[] args) {
        //float n1=8, n2=7, resultado=0;
        //System.out.println("O valor do Primeiro Numero e: " + n1);
        //System.out.println("O valor do Segundo Numero e: " + n2);
        //resultado = (n1+n2)/2;
        //System.out.println("A media e: " + resultado);
        
        int n1, n2, resultado;
        
        Scanner in = new Scanner(System.in); // pode ser qualquer nome.
        
        System.out.print("Digite o primeiro numero: ");
        n1= in.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        n2= in.nextInt();
                
        System.out.println("O valor do Primeiro Numero e: " + n1);
        System.out.println("O valor do Segundo Numero e: " + n2);
        resultado = (n1+n2)/2;
        System.out.println("A media e: " + resultado);
       
        
    }
    
}
