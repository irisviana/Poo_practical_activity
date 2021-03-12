class Lampada3Estado{
    
    public String EstadoLampada;
    
   
    
    public void Acender (){
         EstadoLampada="Acesa";
    }
         
    public void Apagar(){
        EstadoLampada="Apagada";
    }
    public void FicarMeiaLuz(){
        EstadoLampada="Meia luz";
    }
        
    public void MostrarEstado (){
        if (EstadoLampada=="Acesa"){
            System.out.println("A lampada* esta acesa!");
        }
        
        else if (EstadoLampada=="Apagada")  {    
            System.out.println("A lampada** esta apagada!");
        }
        else{
            System.out.println("A lampada*** esta em meia luz!");
        }
        
        }
    }

                   
            
public class TestaLampada3Estado{
    public static void main (String [] args){
        Lampada3Estado Led=new Lampada3Estado();
        Lampada3Estado Fluorescente=new Lampada3Estado();
        Lampada3Estado Incandescente=new Lampada3Estado ();
        
         Led.EstadoLampada="Acesa";
         Fluorescente.EstadoLampada="Apagada";
         Incandescente.EstadoLampada="Meia Luz";
         
         
         Led.MostrarEstado();
         Fluorescente.MostrarEstado();
         Incandescente.MostrarEstado();
    }
}
        
    
    
