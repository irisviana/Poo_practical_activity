
package question2;

/**
 *
 * @author Iris
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa=new Pessoa("Iris",19,"70550481419",12);
        System.out.printf("id=%d\n",pessoa.getID());
        pessoa.print();
    }
    
}
