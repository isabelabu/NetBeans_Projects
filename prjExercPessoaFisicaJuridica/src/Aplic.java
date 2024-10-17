
import fatec.poo.model.PedidoCompra;
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author isabela
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        
        int anoInscricao, anoAtual;
        String cpf, cgc, nome;
        double compra;
        
        System.out.println("Digite o ano atual: ");
        anoAtual = entrada.nextInt();
        
        System.out.println("- Pessoa física -");
        System.out.println("Digite o CPF: ");
        cpf = entrada.next();
        System.out.println("Digite o nome: ");
        nome = entrada.next();
        System.out.println("Digite o ano de inscrição: ");
        anoInscricao = entrada.nextInt();
        
        PessoaFisica pessFis = new PessoaFisica(cpf, nome, anoInscricao);
        System.out.println("Digite o valor base: ");
        pessFis.setBase(entrada.nextDouble());
        
        int i = 0;
        
        do{
            System.out.println("Digite o valor da compra: ");
            compra = entrada.nextDouble();
            pessFis.addCompras(compra);
            i++;
            if(compra>0){
                PedidoCompra pedCom = new PedidoCompra(i);
                pedCom.setValor(compra);
                pedCom.setDataPedido("17/10/2024");
                pessFis.addPedido(pedCom);
            }
            
        }while(compra > 0);
        
        System.out.println("\nCPF: " + pessFis.getCpf());
        System.out.println("Nome: " + pessFis.getNome());
        System.out.println("Ano de inscrição: " + pessFis.getAnoInscricao());
        System.out.println("Base: " + df.format(pessFis.getBase()));
        System.out.println("Total de compras: " + df.format(pessFis.getTotalCompras()));
        System.out.println("Bônus: " + df.format(pessFis.calcBonus(anoAtual)));
        
        pessFis.listarPedidos();
        
        System.out.println("- Pessoa jurídica -");
        System.out.println("Digite o CGC: ");
        cgc = entrada.next();
        System.out.println("Digite o nome: ");
        nome = entrada.next();
        System.out.println("Digite o ano de inscrição: ");
        anoInscricao = entrada.nextInt();
        
        PessoaJuridica pessJur = new PessoaJuridica(cgc,nome,anoInscricao);
        
        System.out.println("Digite a taxa de incentivo: ");
        pessJur.setTaxaIncentivo(entrada.nextDouble());
        
        int x = 0;
        do{
            System.out.println("Digite o valor da compra: ");
            compra = entrada.nextDouble();
            pessJur.addCompras(compra);
            x++;
            if(compra > 0){
                PedidoCompra pedCom = new PedidoCompra(x);
                pedCom.setValor(compra);
                pedCom.setDataPedido("17/10/2024");
                pessJur.addPedido(pedCom);
            }
            
        }while(compra > 0);
        
        System.out.println("\nCGC: " + pessJur.getCgc());
        System.out.println("Nome: " + pessJur.getNome());
        System.out.println("Ano de inscrição: " + pessJur.getAnoInscricao());
        System.out.println("Taxa de incentivo: " + df.format(pessJur.getTaxaIncentivo()) + "%");
        System.out.println("Total de compras: " + df.format(pessJur.getTotalCompras()));
        System.out.println("Bônus: " + df.format(pessJur.calcBonus(anoAtual)));
        
        pessJur.listarPedidos();
    }
    
}
