package testequestao3;



/**
 *
 * @author Iris
 */
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    
public Pessoa(String nome,String cpf,int idade)   {
    this.nome=nome;
    this.cpf=cpf;
    this.idade=idade;
}
public String getNome(){
    return nome;
}
public String getCpf(){
    return cpf;
}
public int getIdade(){
    return idade;
}

public void setNome(String novoNome){
    this.nome=novoNome;
}
public void setIdade(int novaIdade){
    this.idade=novaIdade;
}
}

