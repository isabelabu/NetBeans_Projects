
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.text.DecimalFormat;

/**
 *
 * @author isabela
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.0");
        
        Instrutor objInstr = new Instrutor(12, "Sabrina", "1111-1111");
        Cliente objCli = new Cliente("11111111111", "Julio", "0000-0000");
        
        objCli.setAltura(1.59);
        objCli.setPeso(64);
        objInstr.setAreaAtuacao("Atletismo");
        
        System.out.println("Instrutor");
        System.out.println("Identificação: " + objInstr.getIdentificacao());
        System.out.println("Nome: " + objInstr.getNome());
        System.out.println("Telefone: " + objInstr.getTelefone());
        System.out.println("Área de atuação: " + objInstr.getAreaAtuacao());
        
        System.out.println("\nCliente");
        System.out.println("CPF: " + objCli.getCpf());
        System.out.println("Nome: " + objCli.getNome());
        System.out.println("Telefone: " + objCli.getTelefone());
        System.out.println("Peso: " + df.format(objCli.getPeso()) + "kg");
        System.out.println("Altura: " + df.format(objCli.getAltura()) + "m");
        System.out.println("IMC: " + df.format(objCli.calcImc()) + "Kg/m²");
    }
    
}
