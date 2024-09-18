
import java.util.Scanner;

/**
 *
 * @author isabela
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno objAlu = new Aluno();
        
        int RA, opcao;
        
        
        System.out.println("Digite o RA do aluno:");
        RA = entrada.nextInt();
        objAlu.setRA(RA);
        
        System.out.println("Digite a nota da primeira prova do aluno:");
        objAlu.setNtPrv1(entrada.nextDouble());
        
        System.out.println("Digite a nota da segunda prova do aluno:");
        objAlu.setNtPrv2(entrada.nextDouble());
        
        System.out.println("Digite a nota do primeiro trabalho do aluno:");
        objAlu.setNtTrab1(entrada.nextDouble());
        
        System.out.println("Digite a nota do segundo trabalho do aluno:");
        objAlu.setNtTrab2(entrada.nextDouble());
        
        do{
            System.out.println("\n1 - Exibir nota das provas/trabalhos");
            System.out.println("2 - Exibir média dos trabalhos/provas");
            System.out.println("3 - Exibir média final");
            System.out.println("4 - Sair");
            
            System.out.println("\nDigite a opção: ");
            opcao = entrada.nextInt();
            
            switch (opcao){
                case 1:
                    System.out.println("RA do aluno: " + objAlu.getRA());
                    System.out.println("Nota da prova 1: " + objAlu.getNtPrv1());
                    System.out.println("Nota da prova 2: " + objAlu.getNtPrv2());
                    System.out.println("Nota do trabalho 1: " + objAlu.getNtTrab1());
                    System.out.println("Nota do trabalho 2: " + objAlu.getNtTrab2());
                    break;
                
                case 2:
                    System.out.println("RA do aluno: " + objAlu.getRA());
                    System.out.println("Média das provas: " + objAlu.calcMediaProva());
                    System.out.println("Média dos trabalhos: " + objAlu.calcMediaTrab());
                    break;
                    
                case 3:
                    System.out.println("RA do aluno: " + objAlu.getRA());
                    System.out.println("Média final: " + objAlu.calcMediaFinal());
                    break;
                    
                case 4:
                    break;
                    
                default:
                    System.out.println("Digite um número válido!");
                
            }
        }while(opcao != 4);
    }
    
}
