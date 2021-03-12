
package lampadateste;


public class Contador {
    public int contador;
    
    public void Contador(){
        contador=0;
    }
    
    public Contador(int contador){
    this.contador=contador;
    }
    public void ZerarContador(){
        contador=0;
    }
    public void Contar(){
        contador+=1;
        
    }
    public void ImprimirContador(){
        System.out.printf("a lampada foi acessa %d vez",contador);
    }
    
}
