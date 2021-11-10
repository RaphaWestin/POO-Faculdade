
package exemploclassegrafica;
import javax.swing.JOptionPane;
/**
 *
 * @author Raphael Westim Leite do Carmo
 */
public class ExemploClasseGrafica {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Oi Mundo!");
        //JOptionPane janela = new JOptionPane(); // nao e obrigado a fazer uma instancia 
        
        String texto; //objeto
        String texto2;
        //String resultado;
        int x; // variavel primitiva
        float i;
        
        texto =  JOptionPane.showInputDialog(null,"Digite um numero: ");
        texto2 = JOptionPane.showInputDialog(null,"Digite o segundo numero: ");
        x = Integer.parseInt(texto);
        i = Float.parseFloat(texto2);
        
        if (x+i <= 10) {
            JOptionPane.showMessageDialog(null, "parabens!!");
            
        }else{
            JOptionPane.showMessageDialog(null, "erro!!");
        }
        
        
        JOptionPane.showMessageDialog(null, x + i);
    }
    
}
