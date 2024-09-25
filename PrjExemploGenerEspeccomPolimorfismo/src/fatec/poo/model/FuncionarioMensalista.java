package fatec.poo.model;

/**
 *
 * @author isabela
 */
public class FuncionarioMensalista extends Funcionario{
    private double valorSalMin, numSalMin;
    
    public FuncionarioMensalista(int r, String n, String da, double vsm){
        super(r,n,da);
        valorSalMin = vsm;
    }
    
    public void setNumSalMin(double a){
        numSalMin = a;
    }
    
    public double calcSalBruto(){
        return(valorSalMin * numSalMin);
    }
}
