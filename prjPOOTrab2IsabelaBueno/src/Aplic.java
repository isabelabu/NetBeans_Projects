
import fatec.poo.model.Cliente;
import fatec.poo.model.Garcom;
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
        
        int codGarcom, codCli1, codCli2, numMesaCli1, numMesaCli2;
        String nomeGarcom, nomeCli1, nomeCli2;
        double taxaServico, valorConta1, valorConta2;
        
        //Garçom
        System.out.println("Digite o código do garçom: ");
        codGarcom = entrada.nextInt();
        System.out.println("Digite o nome do garçom: ");
        nomeGarcom = entrada.next();
        System.out.println("Digite a taxa de serviço do garçom (%): ");
        taxaServico = entrada.nextDouble();
        Garcom objGarcom = new Garcom(taxaServico, codGarcom, nomeGarcom);
        System.out.println("Digite o salário do garçom: ");
        objGarcom.setSalBase(entrada.nextDouble());
        
        //Cliente 1
        System.out.println("\nDigite o código do primeiro cliente: ");
        codCli1 = entrada.nextInt();
        System.out.println("Digite o nome do primeiro cliente: ");
        nomeCli1 = entrada.next();
        System.out.println("Digite o número da mesa do primeiro cliente: ");
        numMesaCli1 = entrada.nextInt();
        Cliente objCli1 = new Cliente(numMesaCli1, codCli1, nomeCli1);
        System.out.println("Digite o valor da conta do primeiro cliente: ");
        valorConta1 = entrada.nextDouble();
        objCli1.setTotalConta(valorConta1);
        objGarcom.addGorjeta(valorConta1);
        
        //Cliente 2
        System.out.println("\nDigite o código do segundo cliente: ");
        codCli2 = entrada.nextInt();
        System.out.println("Digite o nome do segundo cliente: ");
        nomeCli2 = entrada.next();
        System.out.println("Digite o número da mesa do segundo cliente: ");
        numMesaCli2 = entrada.nextInt();
        Cliente objCli2 = new Cliente(numMesaCli2, codCli2, nomeCli2);
        System.out.println("Digite o valor da conta do segundo cliente: ");
        valorConta2 = entrada.nextDouble();
        objCli2.setTotalConta(valorConta2);
        objGarcom.addGorjeta(valorConta2);
        
        System.out.println("\nCódigo Garçom: " + objGarcom.getCodigo());
        System.out.println("Nome Garçom: " + objGarcom.getNome());
        System.out.println("\nNum. Mesa: " + objCli1.getNumMesa() + "\tTotal Conta: " + df.format(objCli1.getTotalConta()));
        System.out.println("Num. Mesa: " + objCli2.getNumMesa() + "\tTotal Conta: " + df.format(objCli2.getTotalConta()));
        System.out.println("\nSalário: " + df.format(objGarcom.calcSalarioFinal()));
    }
    
}
