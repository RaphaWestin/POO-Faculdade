
package atividadeobjetografico;
import javax.swing.JOptionPane;
/**
 *
    * @author Raphael Westim
 */
public class AtividadeObjetoGrafico {

    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "Exercicio objeto grafico!");
       
       String texto1;
       String texto2;
       String texto3;
       String texto4;
       int x = 5;
       float i = 5;
       double y = 5;
       
       while(x != 0){
        
        texto1 = JOptionPane.showInputDialog(null, "Digite o primeiro Numero:");
        x = Integer.parseInt(texto1);
        
           if (i > 0 ) {
               texto2 = JOptionPane.showInputDialog(null,"Digite o Segundo Numero:");
               i = Float.parseFloat(texto2);  
           }else{
               JOptionPane.showMessageDialog(null, "Fim do Programa!");  
           }
        
        texto3 = JOptionPane.showInputDialog(null,"Digite o Terceiro Numero:");
        texto4 = JOptionPane.showInputDialog(null,"Digite o Quarto Numero:");
        
        
        y = Double.parseDouble(texto4);
        
        
       }
       
      JOptionPane.showMessageDialog(null, "Fim do Programa!");
       
       
       
       
       
    }
    
}
