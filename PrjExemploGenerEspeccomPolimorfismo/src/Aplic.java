
import fatec.poo.model.FuncionarioHorista;
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
        System.out.println("Salário bruto: " + df.format(funHor.calcSalBruto()));
        System.out.println("Desconto: " + df.format(funHor.calcDesconto()));
        System.out.println("Salário líquido: " + df.format(funHor.calcSalLiquido()));
    }
    
}
