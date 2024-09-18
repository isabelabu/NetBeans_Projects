
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author isabela
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        double coef_A, coef_B, coef_C;
        
        System.out.println("Digite o coeficiente A da equação: ");
        coef_A = entrada.nextDouble();
        
        System.out.println("Digite o coeficiente B da equação: ");
        coef_B = entrada.nextDouble();
        
        System.out.println("Digite o coeficiente C da equação: ");
        coef_C = entrada.nextDouble();
        
        Equacao2Grau objEq = new Equacao2Grau(coef_A,coef_B,coef_C);
        
        System.out.println("\nEquação: " + objEq.exibeEquacao());
        
        if(objEq.calcDelta() == 0){
            System.out.println("Raiz: " + df.format(objEq.calcRaiz(1)));
        } else if(objEq.calcDelta() < 0){
            System.out.println("Não tem raiz real");
            
        }else{
            System.out.println("Raiz 1: " + df.format(objEq.calcRaiz(1)));
            System.out.println("Raiz 2: " + df.format(objEq.calcRaiz(2)));
        }
    }
    
}
