package teste_cartaoweb;



/**
 *
 * @author Iris
 */

public class Aniversario extends CartaoWeb{
   
    
public Aniversario (String destinatario){
    super(destinatario);
}
    @Override
    public void exibirMensagem() {
        System.out.println("Feliz Aniversario");
    }

}
