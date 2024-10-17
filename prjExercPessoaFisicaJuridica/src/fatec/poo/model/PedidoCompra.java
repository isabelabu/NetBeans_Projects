package fatec.poo.model;

/**
 *
 * @author isabela
 */
public class PedidoCompra {
    private int numero;
    private String dataPedido;
    private double valor;

    public PedidoCompra(int numero) {
        this.numero = numero;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public int getNumero() {
        return numero;
    }

    public String getDataPedido() {
        return dataPedido;
    }
    
    
}
