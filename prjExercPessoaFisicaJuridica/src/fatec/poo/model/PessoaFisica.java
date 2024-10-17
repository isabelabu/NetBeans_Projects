package fatec.poo.model;

/**
 *
 * @author isabela
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private double base;
    
    public PessoaFisica(String c, String n, int a){
        super(n,a);
        cpf = c;
    }
    
    public void setBase(double b){
        base = b;
    }
    
    public double calcBonus(int anoAtual){
        if(super.getTotalCompras() > 12000){
            return((anoAtual - getAnoInscricao())*base);
        } else return 0;
    }
    
    public String getCpf(){
        return(cpf);
    }
    
    public double getBase(){
        return(base);
    }
}
