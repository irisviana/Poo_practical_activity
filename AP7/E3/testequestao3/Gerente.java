package testequestao3;


import testequestao3.Funcionario;



/**
 *
 * @author Iris
 */
public class Gerente extends  Funcionario{
    private float descontoMax;

    
public Gerente (float descontoMax,double salario,int quantidadeCompras,String nome,String cpf,int idade){
    
    super(salario,quantidadeCompras,nome,cpf,idade);
        this.descontoMax=descontoMax;
        
}

public float getDesconto(){
    return descontoMax;
}
public void setDesconto(float novaGorjeta){
    this.descontoMax=novaGorjeta;
}
}
