package fatec.poo.model;

/**
 *
 * @author isabela
 */
abstract public class Funcionario {
    private int registro;
    private String nome, dtAdmissao;
    
    public Funcionario(int r, String n, String da){
        registro = r;
        nome = n;
        dtAdmissao = da;
    }
    
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
}
