package fatec.poo.model;

import java.text.DecimalFormat;

/**
 *
 * @author isabela
 */
abstract public class Pessoa {
    DecimalFormat df = new DecimalFormat("#,##0.00");
    
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    private PedidoCompra[] cadPedidos;
    private int numPed;
    
    public Pessoa(String n, int ai){
        nome = n;
        anoInscricao = ai;
        cadPedidos = new PedidoCompra[10];
        numPed = 0;
    }
    
    abstract public double calcBonus(int ano);
    
    public void addCompras(double compra){
        totalCompras += compra;
    }
    
    public String getNome(){
        return(nome);
    }
    
    public int getAnoInscricao(){
        return(anoInscricao);
    }
    
    public double getTotalCompras(){
        return(totalCompras);
    }
    
    public void addPedido(PedidoCompra p){
        cadPedidos[numPed] = p;
        numPed ++;
    }
    
    public void listarPedidos(){
        System.out.println("Número \t\t Data \t\t Valor");
        for(int i = 0; i < numPed; i++){
            System.out.println(cadPedidos[i].getNumero() + "\t\t" 
                    + cadPedidos[i].getDataPedido() + "\t\t" + df.format(cadPedidos[i].getValor()));
        }
    }
}
