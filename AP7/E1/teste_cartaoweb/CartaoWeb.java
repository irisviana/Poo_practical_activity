package teste_cartaoweb;



/**
 *
 * @author Iris
 */
public abstract class CartaoWeb {
    private String destinario;
    
public CartaoWeb(String destinario){
    this.destinario=destinario;
}

public abstract void  exibirMensagem();
}
