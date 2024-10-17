package fatec.poo.model;

/**
 *
 * @author isabela
 */
public class PessoaJuridica extends Pessoa{
    private String cgc;
    private double taxaIncentivo;
    
    public PessoaJuridica(String c, String n, int ai){
        super(n,ai);
        cgc = c;
    }
    
    public void setTaxaIncentivo(double ti){
        taxaIncentivo = ti;
    }
    
    public double calcBonus(int anoAtual){
        return(((taxaIncentivo/100)*getTotalCompras())*(anoAtual-getAnoInscricao()));
    }
    
    public String getCgc(){
        return(cgc);
    }
    
    public double getTaxaIncentivo(){
        return(taxaIncentivo);
    }
}
