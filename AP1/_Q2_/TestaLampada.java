     public class Lampada {
    
    public String EstadoLampada;
    
    public void Acender (){
         EstadoLampada="Acesa";
    }
         
    public void Apagar(){
        EstadoLampada="Apagada";
    }
        
    public void MostrarEstado (){
        if (EstadoLampada=="Acesa"){
            System.out.println("A lampada esta acesa");
        }
        
        else{    
            System.out.println("A lampada esta apagada");
        }
        
    }
}

public class TestaLampada{
    public static void main (String [] args){
        Lampada Led=new Lampada();
        Lampada Fluorescente=new Lampada();
        
         Led.EstadoLampada="Apagada";
         Fluorescente.EstadoLampada ="Acesa";
         
         Led.MostrarEstado();
         Fluorescente.MostrarEstado();
    }
}
        
                   
            
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           