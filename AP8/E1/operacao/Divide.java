
package operacao;

/**
 *
 * @author Iris
 */
public class Divide implements IOperacoes{

    @Override
    public double calcular(int num1, int num2) {
        double resultado;
       resultado=num1/num2;
        return resultado;
    }
    
}
