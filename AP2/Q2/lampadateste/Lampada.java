
package lampadateste;
public class Lampada{
     public boolean EstadoLampada;
     Contador contador;
     
     
    public Lampada(boolean EstadoLampada,Contador contador){
        this.EstadoLampada= EstadoLampada;
        this.contador=contador;
        
    }
    public void Acender (){
         EstadoLampada=true;
         contador.Contar();
        
    }
         
    public void Apagar(){
        EstadoLampada=false;
    }
        
    public void MostrarEstado (){
        if (EstadoLampada==true){
            System.out.println("A lampada esta acesa!");
        }
        
        else  {    
            System.out.println("A lampada esta apagada!");
        }
        
    }
    
    public void MostrarLampada_Acessa(){
       
        contador.ImprimirContador();
          
    
    }
}
   
    
