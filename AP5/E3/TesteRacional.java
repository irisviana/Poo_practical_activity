/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeracional;

/**
 *
 * @author Iris
 */
public class TesteRacional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            
        
        
        
       
        Racional.reduzirFracao(2, 2);
        System.out.printf("%d/%d\n",Racional.novoNumerador,Racional.novoDenominador);
        Racional.reduzirFracao(3, 4);
        Racional.reduzirFracao(45, 3);
        System.out.printf("%d/%d\n",Racional.novoNumerador,Racional.novoDenominador);
    }
    
}
