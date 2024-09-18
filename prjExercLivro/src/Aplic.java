
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author isabela
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        
        int identificacao, opcao, diasEmAtraso;
        String titulo;
        
        System.out.println("Digite o número de identificação do livro:");
        identificacao = entrada.nextInt();
        
        System.out.println("Digite o título do livro:");
        titulo = entrada.next();
        
        Livro objLivr = new Livro(identificacao, titulo);
        
        System.out.println("Digite o valor da multa diária:");
        objLivr.setValMultaDiaria(entrada.nextDouble());
        
        do{
            System.out.println("\n1 - Consultar livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Sair");
            
            System.out.println("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Identificação do livro: " + objLivr.getIdentificacao());
                    System.out.println("Título do livro: " + objLivr.getTitulo());
                    if(objLivr.getSituacao()){
                        System.out.println("Situação: emprestado");
                    } else{
                        System.out.println("Situação: disponível");
                    }
                    break;
                case 2:
                    if(objLivr.getSituacao()){
                        System.out.println("O livro já está emprestado");
                    } else{
                        objLivr.emprestar();
                    }
                    break;
                case 3:
                    if(objLivr.getSituacao() ==  false){
                        System.out.println("O livro já está disponível");
                    } else{
                        System.out.println("Digite quantos dias de atraso:");
                        diasEmAtraso = entrada.nextInt();
                        System.out.println("Multa: " + df.format(objLivr.devolver(diasEmAtraso)));
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }
        }while(opcao != 4);
    }
    
}
