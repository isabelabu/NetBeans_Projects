package fatec.poo.model;

/**
 *
 * @author isabela
 */
public class Cliente extends Pessoa{
    private int numMesa;
    private double totalConta;

    public Cliente(int numMesa, int codigo, String nome) {
        super(codigo, nome);
        this.numMesa = numMesa;
    }

    public void setTotalConta(double totalConta) {
        this.totalConta = totalConta;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public double getTotalConta() {
        return totalConta;
    }
    
}
