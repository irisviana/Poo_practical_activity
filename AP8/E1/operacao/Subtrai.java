/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacao;

/**
 *
 * @author Iris
 */
public class Subtrai implements IOperacoes{

    @Override
    public double calcular(int num1, int num2) {
         double resultado;
       resultado=num1-num2;
        return resultado;
    }
    
}
