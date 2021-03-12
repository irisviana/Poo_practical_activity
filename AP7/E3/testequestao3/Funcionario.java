package testequestao3;


import testequestao3.Cliente;



/**
 *
 * @author Iris
 */
public   abstract class Funcionario extends Cliente{
    private  double salario;
 
public Funcionario(double salario,int quantidadeCompras,String nome,String cpf,int idade){
    super(quantidadeCompras,nome,cpf,idade);
    this.salario=salario;
    
}

    
public double getSalario(){
    return salario;
}

}
