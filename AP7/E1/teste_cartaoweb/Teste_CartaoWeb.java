
package teste_cartaoweb;

/**
 *
 * @author Iris
 */
public class Teste_CartaoWeb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      CartaoWeb[] cartaoWeb=new CartaoWeb[3] ;
      
      CartaoWeb diaNamorados=new DiaDosNamorados ("IRIS");
      CartaoWeb natal=new Natal("Iara");
      CartaoWeb aniversario =new Aniversario("Pedro");
      
      cartaoWeb[0]=diaNamorados;
      cartaoWeb[1]=natal;
      cartaoWeb[2]= aniversario;
      for(int i=0;i<3;i++){
          
          cartaoWeb[i].exibirMensagem();
      }
      
    }
    
}
