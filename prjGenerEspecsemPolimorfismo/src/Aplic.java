
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
import java.text.DecimalFormat;

/**
 *
 * @author isabela
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        Aluno objAlu = new Aluno(1010, "Carlos Silva", "15/03/1978");
        
        objAlu.setValorMensalidade(900);
        System.out.println("Registro: " + objAlu.getRegEscolar());
        System.out.println("Nome: " + objAlu.getNome());
        System.out.println("Data de nascimento: " + objAlu.getDataNascimento());
        System.out.println("Mensalidade: " + df.format(objAlu.getMensalidade()));
        
        Professor objProf = new Professor(123, "Antonio Pereira", "15/04/1978");
        
        objProf.setSalario(1500);
        System.out.println("\nRegistro: " + objProf.getRegFuncional());
        System.out.println("Nome: " + objProf.getNome());
        System.out.println("Data de nascimento: " + objProf.getDataNascimento());
        System.out.println("Salário: " + df.format(objProf.getSalario()));
    }
    
}
