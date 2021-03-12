package testequestao2;



/**
 *
 * @author Iris
 */
public class Amigo extends Pessoa {
    private String dataAniversario;
    
    
    
public Amigo(String n,int i,String data){
    super(n,i);
   
    this.dataAniversario=data;
    
    
}
public Amigo(){
    super();
}
    @Override
    public String getDataAniversario(){
     return dataAniversario;
 }
    

    @Override
 public String getEmail() {
        return null;
    }

    @Override
    public String toString(){
    
    return (" nome= "+ this.getName()+"\n"+ " idade="+this.getIdade()+"\n"+"data aniversario="+dataAniversario);
}

    
    

    
}

