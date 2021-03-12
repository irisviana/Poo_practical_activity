package teste_cartaoweb;


/**
 *
 * @author Iris
 */
public class DiaDosNamorados extends CartaoWeb
{
    
public DiaDosNamorados(String destinatario){
    super(destinatario);
}

    @Override
    public void exibirMensagem() {
        System.out.println("Feliz dia dos namorados");
}
}
