package testequestao3;



/**
 *
 * @author Iris
 */
public class Cliente extends Pessoa{
    private int quantidadeCompras;
    
public Cliente (int quantidadeCompras,String nome,String cpf,int idade){
    super(nome,cpf,idade);
    this.quantidadeCompras=quantidadeCompras;
   
}

public int getQuantidadeCompras(){
    return quantidadeCompras;
}

public void setQuantidadeCompras(int novaCompra){
    this.quantidadeCompras=novaCompra;
}


}
