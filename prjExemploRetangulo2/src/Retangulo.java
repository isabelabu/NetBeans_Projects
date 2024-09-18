/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isabela
 */
public class Retangulo {
    private double altura;
    private double base;
	
    public void setAltura(double a){
	altura = a;
    }
    
    public double getAltura(){
        return(altura);
    }
	
    public void setBase(double b){
       	base = b;
    }
    
    public double getBase(){
        return(base);
    }
	
    public double calcArea(){
    	return (altura * base);
    }
	
    public double calcPerimetro(){
    	return ((altura + base) * 2);
    }
    
    public double calcDiagnonal(){
        return(Math.sqrt(Math.pow(altura,2) + Math.pow(base,2)));
        
    }
}
