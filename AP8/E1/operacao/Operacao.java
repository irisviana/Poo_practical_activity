
package operacao;

/**
 *
 * @author Iris
 */
public class Operacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      IOperacoes op1=new  Soma();
      IOperacoes op2=new  Divide();
      IOperacoes op3=new  Subtrai();
      IOperacoes op4=new  Multiplica();
      
      System.out.printf("soma=%f\n",op1.calcular(20, 20));
      System.out.printf("dividi=%2f\n",op2.calcular(20, 20));
      System.out.printf("subtrai=%f\n",op3.calcular(20, 20));
      System.out.printf("multiplica=%f\n",op4.calcular(20, 20));
      
    }
    
}
