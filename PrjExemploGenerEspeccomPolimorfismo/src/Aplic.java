
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author isabela
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        FuncionarioHorista funHor = new FuncionarioHorista(1010, "Pedro Silveira", "15/03/1978", 15.80);
        
        funHor.setQtdeHorTrab(90);
        funHor.setCargo("Programador");
        System.out.println("Registro: " + funHor.getRegistro());
        System.out.println("Nome: " + funHor.getNome());
        System.out.println("Cargo: " + funHor.getCargo());
        System.out.println("Data de admissão: " + funHor.getDtAdmissao());
        System.out.println("Salário bruto: " + df.format(funHor.calcSalBruto()));
        System.out.println("Desconto: " + df.format(funHor.calcDesconto()));
        System.out.println("Gratificação: " + df.format(funHor.calcGratificacao()));
        System.out.println("Salário líquido: " + df.format(funHor.calcSalLiquido()));
        
        FuncionarioMensalista funMen = new FuncionarioMensalista(2020, "Adriana Silveira", "09/02/1999", 1900.00);
        
        funMen.setNumSalMin(2);
        funMen.setCargo("Aux. Administrativo");
        System.out.println("\nRegistro: " + funMen.getRegistro());
        System.out.println("Nome: " + funMen.getNome());
        System.out.println("Cargo: " + funMen.getCargo());
        System.out.println("Data de admissão: " + funMen.getDtAdmissao());
        System.out.println("Salário bruto: " + df.format(funMen.calcSalBruto()));
        System.out.println("Desconto: " + df.format(funMen.calcDesconto()));
        System.out.println("Salário líquido: " + df.format(funMen.calcSalLiquido()));
        
        FuncionarioComissionado funCom = new FuncionarioComissionado(3030, "Julio Lima", "10/12/1990", 10);
        
        funCom.setCargo("Vendedor");
        funCom.setSalBase(900);
        funCom.addVendas(1000);
        funCom.addVendas(3000);
        funCom.addVendas(4000);
        System.out.println("\nRegistro: " + funCom.getRegistro());
        System.out.println("Nome: " + funCom.getNome());
        System.out.println("Cargo: " + funCom.getCargo());
        System.out.println("Data de admissão: " + funCom.getDtAdmissao());
        System.out.println("Salário base: " + df.format(funCom.getSalBase()));
        System.out.println("Total de vendas: " + df.format(funCom.getTotalVendas()));
        System.out.println("Taxa de comissão: " + df.format(funCom.getTaxaComissao()) + "%");
        System.out.println("Salário bruto: " + df.format(funCom.calcSalBruto()));
        System.out.println("Desconto: " + df.format(funCom.calcDesconto()));
        System.out.println("Gratificação: " + df.format(funCom.calcGratificacao()));
        System.out.println("Salário líquido: " + df.format(funCom.calcSalLiquido()));
    }
    
}
