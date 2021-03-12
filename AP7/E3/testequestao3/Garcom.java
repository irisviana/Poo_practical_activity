package testequestao3;


import testequestao3.Funcionario;



/**
 *
 * @author Iris
 */
public class Garcom extends  Funcionario {
    private float gorjeta  ;

    
    public Garcom(float gorjeta,double salario,int quantidadeCompras,String nome,String cpf,int idade){
        super(salario,quantidadeCompras,nome,cpf,idade);
        this.gorjeta=gorjeta;
        
    }
public float getGorjeta(){
    return gorjeta;
}
public void setGorjeta(float novaGorjeta){
    this.gorjeta=novaGorjeta;
}
   
}
