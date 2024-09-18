/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isabela
 */
public class Aplic {

    public static void main(String[] args) {
        //Criação do ponteiro
        Retangulo objRet, objRet1;
        
        //Instanciação(alocação)
        objRet = new Retangulo();
        
        //Passagens de mensagens
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        
        //gets
        System.out.println("Medida da altura do retângulo: " + objRet.getAltura());
        System.out.println("Medida da base do retângulo: " + objRet.getBase());
        
        //sets
        System.out.println("Medida da área: " + objRet.calcArea());
        System.out.println("Medida do perímetro: " + objRet.calcPerimetro());
        System.out.println("Medida da diagonal: " + objRet.calcDiagnonal());
        
        //Nova instanciação
        objRet1 = new Retangulo();
        
        objRet1.setAltura(3.0);
        objRet1.setBase(4.0);
        
        System.out.println("\n\nMedida da altura do retângulo: " + objRet1.getAltura());
        System.out.println("Medida da base do retângulo: " + objRet1.getBase());
        
        System.out.println("Medida da área: " + objRet1.calcArea());
        System.out.println("Medida do perímetro: " + objRet1.calcPerimetro());
        System.out.println("Medida da diagonal: " + objRet1.calcDiagnonal());
        
    }
    
}
