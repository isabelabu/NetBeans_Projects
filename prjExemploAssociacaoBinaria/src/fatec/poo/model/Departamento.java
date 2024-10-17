package fatec.poo.model;

/**
 *
 * @author isabela
 */
public class Departamento {
    private String sigla, nome;
    private Funcionario[] funcionarios; //matriz de objetos multiplicidade 1..
    private int numFunc; //indice da matriz

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5];
        numFunc = 0; //representa a posição do primeiro elemento da matriz
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc ++;
    }
    
    public void listarFuncionarios(){
        System.out.println("Sigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtde. de Funcionários: " + numFunc);
        
        System.out.println("Registro \t\t Nome \t\t Cargo");
        for(int i = 0; i < numFunc; i++){
            System.out.println(funcionarios[i].getRegistro() + "\t\t" 
                    + funcionarios[i].getNome() + "\t\t" + funcionarios[i].getCargo());
        }
    }
    
}
