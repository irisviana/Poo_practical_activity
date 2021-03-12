

package testequestao2;

import testequestao2.Amigo;


/**
 *
 * @author Iris
 */
public class Conhecido extends Pessoa{
    private String email;
    
  
    
public Conhecido(String nome, int idade,String email){
    super(nome,idade);
    this.email=email;
    
    
    
    
}
public Conhecido(){
    super();
}
    @Override
 public String  getEmail(){
    return email;
}

@Override
public String getDataAniversario() {
        return null;
    }
  
  
public void setEmail(String novoEmail){
    this.email=novoEmail ;
}
public String toString(){
    
    return (" nome= "+ this.getName()+ " idade= " +this.getIdade()+"email"+email);
}

    
    
}
