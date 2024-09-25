package fatec.poo.model;

/**
 *
 * @author isabela
 */
public class FuncionarioComissionado extends Funcionario{
    private double salBase, taxaComissao, totalVendas;
    
    public FuncionarioComissionado(int r, String n, String da, double tc){
        super(r,n,da);
        taxaComissao = tc;
    }
    
    public void setSalBase(double sb){
        salBase = sb;
    }
    
    public double getSalBase(){
        return(salBase);
    }
    
    public double getTotalVendas(){
        return(totalVendas);
    }
    
    public double getTaxaComissao(){
        return(taxaComissao);
    }
    
    public void addVendas(double v){
        totalVendas += v;
    }
    
    public double calcSalBruto(){
        return(salBase + (taxaComissao * 0.01) * totalVendas);
    }
    
    public double calcGratificacao(){
        if(totalVendas <= 5000){
            return(0);
        } else if(totalVendas > 5000 && totalVendas <= 10000){
            return(calcSalBruto()*0.03);
        } else{
            return(calcSalBruto()*0.05);
        }
    }
    
    @Override
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
}
