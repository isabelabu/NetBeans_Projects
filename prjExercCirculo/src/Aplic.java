
import java.util.Scanner;

/**
 *
 * @author isabela
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Circulo objCir = new Circulo();
        
        double raio;
        
        System.out.println("Digite a medida do raio do cículo: ");
        raio = entrada.nextDouble();
        
        objCir.setRaio(raio);
        
        System.out.println("Medida do raio do círculo: " + objCir.getRaio());
        System.out.println("Medida da área do círculo: " + objCir.calcArea());
        System.out.println("Medida do perímetro do círculo: " + objCir.calcPerimetro());
        System.out.println("Medida do diâmetro do círculo: " + objCir.calcDiametro());
        
    }
    
}
