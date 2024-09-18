/**
 *
 * @author isabela
 */
public class Aluno {
    private int RA;
    private double NtPrv1, NtPrv2, NtTrab1, NtTrab2;
    
    public void setRA(int a){
        RA = a;
    }
    
    public void setNtPrv1(double a){
        NtPrv1 = a;
    }
    
    public void setNtPrv2(double a){
        NtPrv2 = a;
    }
    
    public void setNtTrab1(double a){
        NtTrab1 = a;
    }
    
    public void setNtTrab2(double a){
        NtTrab2 = a;
    }
    
    public int getRA(){
        return(RA);
    }
    
    public double getNtPrv1(){
        return(NtPrv1);
    }
    
    public double getNtPrv2(){
        return(NtPrv2);
    }
    
    public double getNtTrab1(){
        return(NtTrab1);
    }
    
    public double getNtTrab2(){
        return(NtTrab2);
    }
    
    public double calcMediaProva(){
        return(0.75*(NtPrv1+2*NtPrv2)/3);
    }
    
    public double calcMediaTrab(){
        return(0.25*(NtTrab1+NtTrab2)/2);
    }
    
    public double calcMediaFinal(){
        return(calcMediaTrab()+calcMediaProva());
    }
}
