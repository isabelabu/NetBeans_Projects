/**
 *
 * @author isabela
 */
public class Livro {
    private int identificacao;
    private String titulo;
    private boolean situacao = false;
    private double valMultaDiaria;
    
    public Livro(int id, String ti){
        identificacao = id;
        titulo = ti;
    }
    
    public void setValMultaDiaria(double valor){
        valMultaDiaria = valor;
    }
    
    public int getIdentificacao(){
        return(identificacao);
    }
    
    public String getTitulo(){
        return(titulo);
    }
    
    public boolean getSituacao(){
        return(situacao);
    }
    
    public void emprestar(){
        situacao = true;
    }
    
    public double devolver(int diasEmAtraso){
        situacao = false;
        return(valMultaDiaria*diasEmAtraso);
    }
}
