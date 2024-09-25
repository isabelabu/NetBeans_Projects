package fatec.poo.model;

/**
 *
 * @author isabela
 */
abstract public class Funcionario {
    private int registro;
    private String nome, dtAdmissao;
    private String cargo;
    
    public Funcionario(int r, String n, String da){
        registro = r;
        nome = n;
        dtAdmissao = da;
    }
    
    abstract public double calcSalBruto();
    
    public String getCargo(){
        return(cargo);
    };
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
    
    public int getRegistro(){
        return(registro);
    }
    
    public String getNome(){
        return(nome);
    }
    
    public String getDtAdmissao(){
        return(dtAdmissao);
    }
    
    public void setCargo(String c){
        cargo = c;
    }
}
