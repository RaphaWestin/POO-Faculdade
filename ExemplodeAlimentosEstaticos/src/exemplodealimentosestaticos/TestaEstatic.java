
package exemplodealimentosestaticos;

public class TestaEstatic {
    
     int n1=567;
     
     public static void soma(int valor) {
        
        TestaEstatic objeto = new TestaEstatic();
        
        objeto.n1 = objeto.n1 + valor;
    }
    
    public static void main(String[] args) {
        soma(200);
        
        TestaEstatic objeto = new TestaEstatic();
        
        objeto.soma(400);
        
        System.out.println("o valor da variavel e: " + objeto.n1);
    }
    
}
