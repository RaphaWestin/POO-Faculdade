
package locadoradeveiculos;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Rapha
 */
public class CadastrodeVeiculos {
    public static void main(String[] args) {
        int opcao;
        String x;
        
        //opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha <0> para sair <1> para Veiculos de Passeio <2> para Veiculos de Carga"));
        
        do{
            x = JOptionPane.showInputDialog("Escolha <0> para sair <1> para Veiculos de Passeio <2> para Veiculos de Carga");
            opcao = Integer.parseInt(x); // conversao de String para int 

            if(opcao == 1){
                VeiculoPasseio vp = new VeiculoPasseio();
                
                vp.ID = Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo do Veiculo: ")); // metodo teclado com a classe
                System.out.println(vp.ID); // teste de Id
                
                vp.cor = JOptionPane.showInputDialog("Qual cor do Veiculo: "); // metodo teclado com a classe
                System.out.println(vp.cor); // teste de cor
                
                vp.dt_cadrastro = JOptionPane.showInputDialog("Qual a data do cadrastro: "); // metodo teclado com a classe
                System.out.println(vp.dt_cadrastro); // teste de data de cadastro
                
                vp.marca = JOptionPane.showInputDialog("Qual a marca do veiculo: "); // metodo teclado com a classe
                System.out.println(vp.marca); // teste marca
                
                vp.modelo  = JOptionPane.showInputDialog("Qual a modelo do veiculo: "); // metodo teclado com a classe
                System.out.println(vp.modelo); // teste modelo
                
                vp.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Veiculo: "));
                System.out.println(vp.valor);// teste valor
                
                vp.setAno( Double.parseDouble(JOptionPane.showInputDialog("Digite o ano do Veiculo: ")));
                System.out.println(vp.getAno());// teste do ano
                
                vp.setKM( Integer.parseInt(JOptionPane.showInputDialog("Digite o km do Veiculo: ")));
                System.out.println(vp.getKM());// teste do km
                
                vp.setChassi(Long.parseLong(JOptionPane.showInputDialog("Digite o Chassi do Veiculo: ")));
                System.out.println(vp.getChassi());// teste do chassi
                
                JOptionPane.showMessageDialog(null, "Os dados digitados foram:\n " + vp.ID + "\n " + vp.cor + "\n" + vp.dt_cadrastro +
                                             "\n" + vp.marca + "\n" + vp.modelo + "\n" + vp.getAno() + "\n" +  vp.getChassi() + "\n" + vp.getKM());
                
                
            }

            if(opcao == 2){
                VeiculoCarga vc = new VeiculoCarga();
                
                vc.ID = Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo do Veiculo: ")); // metodo teclado com a classe
                System.out.println(vc.ID); // teste de Id
                
                vc.cor = JOptionPane.showInputDialog("Qual cor do Veiculo: "); // metodo teclado com a classe
                System.out.println(vc.cor); // teste de cor
                
                vc.dt_cadastro = JOptionPane.showInputDialog("Qual a data do cadrastro: "); // metodo teclado com a classe
                System.out.println(vc.dt_cadastro); // teste de data de cadastro
                
                vc.marca = JOptionPane.showInputDialog("Qual a marca do veiculo: "); // metodo teclado com a classe
                System.out.println(vc.marca); // teste marca
                
                vc.modelo  = JOptionPane.showInputDialog("Qual a modelo do veiculo: "); // metodo teclado com a classe
                System.out.println(vc.modelo); // teste modelo
                
                vc.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Veiculo: "));
                System.out.println(vc.valor);// teste valor
                
                vc.setAno( Double.parseDouble(JOptionPane.showInputDialog("Digite o ano do Veiculo: ")));
                System.out.println(vc.getAno());// teste do ano
                
                vc.setKM( Integer.parseInt(JOptionPane.showInputDialog("Digite o km do Veiculo: ")));
                System.out.println(vc.getKM());// teste do km
                
                vc.setChassi(Long.parseLong(JOptionPane.showInputDialog("Digite o Chassi do Veiculo: ")));
                System.out.println(vc.getChassi());// teste do chassi
                
                
              
            }
       
        }while(opcao != 0);
        
        
        
        
       
    }// FIM DO MAIN 
}// FIM DA CLASSE
