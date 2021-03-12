package testequestao2;


/**
 *
 * @author Iris
 */
public class Agenda {
    private Pessoa[] listaPessoa;
    private int tamanho;
public Agenda(){
    tamanho=10;
    this.listaPessoa=new Pessoa[tamanho];
    
}           
public void addAgenda(Pessoa pessoa){
     boolean adicionou = false;
     
     for(int i=0; i<listaPessoa.length; i++){
        if(listaPessoa[i] == null){
                listaPessoa[i] = pessoa;
                adicionou = true;
                break;
        }
        }
        if(!adicionou){
            System.out.println("ERRO: O repositório está cheio!");
            
}

}  

   
public  int contarAmigos(){
        int numAmigos=0;
        
        for(int i=0; i<listaPessoa.length; i++){
             
            if (listaPessoa[i] instanceof Amigo) {
              
                numAmigos=numAmigos+1;
                }
        }
                
        
        return numAmigos;
        }
    
    
 

    
public int contarConhecidos(){
    
    int numConhecidos=0;
    
   for(int i=0;i<listaPessoa.length;i++){
        if( listaPessoa[i] instanceof Conhecido){
         numConhecidos=numConhecidos+1;
        }
}
    return numConhecidos;

    
}
public void mostrarInformacoesAmigos(){
    

    for(int i=0;i<listaPessoa.length;i++){
        if( listaPessoa[i] instanceof Amigo){
           
          System.out.println(listaPessoa[i].getDataAniversario());
          System.out.println(listaPessoa[i].getEmail());
        
        }
}
  
}   
public void mostrarInformacoesConhecidos(){
    

    for(int i=0;i<listaPessoa.length;i++){
        if( listaPessoa[i] instanceof Conhecido){
           
          System.out.println(listaPessoa[i].getDataAniversario());
          System.out.println(listaPessoa[i].getEmail());
        
        }
}
  
}


    
    
}

