
import java.util.Scanner;

/**
 *
 * @author isabela
 */
public class Aplic {

    public static void main(String[] args) {
        String unidade;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();
        
        Circulo objCir = new Circulo(unidade);
        
        double raio;
        
        System.out.println("Digite a medida do raio do cículo: ");
        raio = entrada.nextDouble();
        
        objCir.setRaio(raio);
        
        System.out.println("Medida do raio do círculo: " + objCir.getRaio() + " " + objCir.getUnidadeMedida());
        System.out.println("Medida da área do círculo: " + objCir.calcArea() + " " + objCir.getUnidadeMedida() + "²");
        System.out.println("Medida do perímetro do círculo: " + objCir.calcPerimetro() + " " + objCir.getUnidadeMedida());
        System.out.println("Medida do diâmetro do círculo: " + objCir.calcDiametro() + " " + objCir.getUnidadeMedida());
    }
    
}
