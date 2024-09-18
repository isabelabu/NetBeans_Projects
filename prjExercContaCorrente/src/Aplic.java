
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
        
        int numero, opcao;
        double saldo, valor;
        
        System.out.println("Digite o número da conta:");
        numero = entrada.nextInt();
        
        System.out.println("Digite o saldo da conta:");
        saldo = entrada.nextDouble();
        
        ContaCorrente objCon = new ContaCorrente(numero,saldo); 
        
        do{
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            
            System.out.println("\nDigite a opção: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Número da conta: " + objCon.getNumero());
                    System.out.println("Digite o valor do depósito: ");
                    valor = entrada.nextDouble();
                    objCon.depositar(valor);
                    break;
                case 2:
                    System.out.println("Número da conta: " + objCon.getNumero());
                    System.out.println("Digite o valor do saque: ");
                    valor = entrada.nextDouble();
                    
                    if(valor > objCon.getSaldo()){
                        System.out.println("Saldo insuficiente!");
                    }else{
                        objCon.sacar(valor);
                    }
                    break;
                case 3:
                    System.out.println("Número da conta: " + objCon.getNumero());
                    System.out.println("Saldo da conta: " + df.format(objCon.getSaldo()));
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Digite uma opção válida");
                    break;
                    
            }
        }while(opcao != 4);
    }
    
}
