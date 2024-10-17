package fatec.poo.model;

/**
 *
 * @author isabela
 */
public class Projeto {
    private int codigo;
    private String descricao, dtInicio, dtTermino;
    private Funcionario[] funcionarios; 
    private int numFunc;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new Funcionario[5];
        numFunc = 0;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc ++;
    }
    
    public void listarFuncionarios(){
        System.out.println("Código " + codigo);
        System.out.println("Descrição " + descricao);
        System.out.println("Data Início " + dtInicio);
        System.out.println("Data Término " + dtTermino);
        System.out.println("Qtde. de Funcionários: " + numFunc);
        
        System.out.println("Registro \t\t Nome \t\t Cargo \t\t Departamento");
        for(int i = 0; i < numFunc; i++){
            System.out.println(funcionarios[i].getRegistro() + "\t\t" 
                    + funcionarios[i].getNome() + "\t\t" + funcionarios[i].getCargo() 
                    + "\t\t" + funcionarios[i].getDepartamento().getNome());
        }
    }
}
