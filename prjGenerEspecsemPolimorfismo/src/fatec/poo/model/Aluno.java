package fatec.poo.model;

/**
 *
 * @author isabela
 */
public class Aluno extends Pessoa{
    private int regEscolar;
    private double mensalidade;
    
    public Aluno(int r, String n, String dn){
        super(n,dn); //super representa a superclasse
        regEscolar = r;
    }
    
    public void setValorMensalidade(double m){
        mensalidade = m;
    }
    
    public int getRegEscolar(){
        return(regEscolar);
    }
    
    public double getMensalidade(){
        return(mensalidade);
    }
}
