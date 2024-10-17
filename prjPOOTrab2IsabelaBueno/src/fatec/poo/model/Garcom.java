package fatec.poo.model;

/**
 *
 * @author isabela
 */
public class Garcom extends Pessoa{
    private double salBase, taxaServico, totalGorjeta;

    public Garcom(double taxaServico, int codigo, String nome) {
        super(codigo, nome);
        this.taxaServico = taxaServico;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getSalBase() {
        return salBase;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public double getTotalGorjeta() {
        return totalGorjeta;
    }
    
    public void addGorjeta(double valorConta){
        totalGorjeta += (valorConta * (taxaServico/100));
    }
    
    public double calcSalarioFinal(){
        return(salBase + totalGorjeta);
    }
    
    
}
