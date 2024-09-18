import java.util.Scanner;

/**
 *
 * @author isabela
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        
        double medAlt, medBase;
        
        System.out.println("Digite a medida da altura do retângulo: ");
        medAlt = entrada.nextDouble();
        
        System.out.println("Digite a medida da base do retângulo: ");
        medBase = entrada.nextDouble();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        System.out.println("Medida da altura do retângulo: " + objRet.getAltura());
        System.out.println("Medida da base do retângulo: " + objRet.getBase());
        
        System.out.println("Medida da área: " + objRet.calcArea());
        System.out.println("Medida do perímetro: " + objRet.calcPerimetro());
        System.out.println("Medida da diagonal: " + objRet.calcDiagnonal());
    }
    
}
