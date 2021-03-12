package teste_cartaoweb;



/**
 *
 * @author Iris
 */

public class Natal extends CartaoWeb{
   
public Natal (String destinatario){
    super(destinatario);
}
    @Override
    public void exibirMensagem() {
        System.out.println("Feliz natal");
    }

}
