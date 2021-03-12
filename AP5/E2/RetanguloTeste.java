/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retanguloteste;

/**
 *
 * @author Iris
 */
public class RetanguloTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Retangulo r1=new Retangulo();
       System.out.println( r1.getAltura());
       System.out.println( r1.getLargura());
       r1.setAltura(12.0);
       r1.setLargura(11.0);
       System.out.println(r1.calcularArea(12.2,2.5));
       System.out.println(r1.calcularPerimetro(12.2,2.5));
      
    }
    
}
