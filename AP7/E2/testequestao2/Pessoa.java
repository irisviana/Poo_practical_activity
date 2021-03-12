package testequestao2;



/**
 *
 * @author Iris
 */
public abstract class Pessoa {
    private String nome;
    private int idade;
    
public Pessoa(String name,int idade){
    this.nome=name;
    this.idade=idade;
}
public Pessoa(){
    
}
public String getName(){
return nome;
}

public int getIdade(){
    return idade;
}

public abstract String getDataAniversario();
public abstract String getEmail();

public void setNome(String n){
    this.nome=n;
    
}
public void setIdade(int i){
    this.idade=i;
}

    @Override
    public String toString(){
    
    return (" nome= "+ nome+ " idade= " +idade);
}

    


}
