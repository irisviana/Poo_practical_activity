/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampadateste;



public class LampadaTeste {

    
    public static void main(String[] args) {
        
        
        boolean Estado_Lampada;
        
        Contador contador1= new Contador(0);
        Contador contador2= new Contador(4);
        Estado_Lampada=true;
       
        Lampada Led=new Lampada(Estado_Lampada,contador1);
        
        Led.Acender();
        Led.MostrarLampada_Acessa();
        
      
       
        
    }
    
}