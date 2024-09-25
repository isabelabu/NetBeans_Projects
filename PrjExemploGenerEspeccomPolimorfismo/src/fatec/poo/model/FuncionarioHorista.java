package fatec.poo.model;

/**
 *
 * @author isabela
 */
public class FuncionarioHorista extends Funcionario{
    private double valorHorTrab;
    private int qtdHorTrab;
    
    public FuncionarioHorista(int r, String n, String da, double vht){
        super(r,n,da);
        valorHorTrab = vht;
    }
    
    public double calcSalBruto(){
        return(valorHorTrab * qtdHorTrab);
    }
    
    public void setQtdeHorTrab(int qht){
        qtdHorTrab = qht;
    }
    
    public double calcGratificacao(){
        return(calcSalBruto()*0.075);
    }
    
    @Override
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
}
