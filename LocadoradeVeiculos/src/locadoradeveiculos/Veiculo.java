
package locadoradeveiculos;

/**
 *
 * @author Rapha
 */
public class Veiculo {
    protected int ID;
    protected String marca;
    protected String modelo;
              String cor;
    private long chassi;
    private double ano;
    
    public void setChassi(long chassi) {
        this.chassi = chassi;
    }
    
    public long getChassi() {
        return chassi;
    }

    public double getAno() {
        return ano;
    }

    public void setAno(double ano) {
        this.ano = ano;
    }
    
    
    
   
    
}
