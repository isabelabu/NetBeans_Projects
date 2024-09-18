
import java.text.DecimalFormat;

/**
 *
 * @author isabela
 */
public class Equacao2Grau {
    DecimalFormat df = new DecimalFormat("#,##0.00");
    
    private double coef_A, coef_B, coef_C;
    
    public Equacao2Grau(double coefa, double coefb, double coefc){
        coef_A = coefa;
        coef_B = coefb;
        coef_C = coefc;
    }
    
    public double calcDelta(){
        return(Math.pow(coef_B,2)-(4*coef_A*coef_C));
    }
    
    public double calcRaiz(int idRaiz){
        if(idRaiz == 1){
            return((-coef_B+Math.sqrt(calcDelta()))/(2*coef_A));
        } else{
            return((-coef_B-Math.sqrt(calcDelta()))/(2*coef_A));
        }
    }
    
    public String exibeEquacao(){
        if(coef_B > 0){
            if(coef_C > 0){
                return(df.format(coef_A) + "x² + " + df.format(coef_B) + "x + " + df.format(coef_C));
            } else{
                return(df.format(coef_A) + "x² + " + df.format(coef_B) + "x " + df.format(coef_C));
            }
        } else{
            if(coef_C > 0){
                return(df.format(coef_A) + "x² " + df.format(coef_B) + "x + " + df.format(coef_C));
            } else{
                return(df.format(coef_A) + "x² " + df.format(coef_B) + "x " + df.format(coef_C));
            }
        }
    }
}
