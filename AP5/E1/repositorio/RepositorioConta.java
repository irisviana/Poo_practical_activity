/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import java.util.ArrayList;
import entidade.Conta;
/**
 *
 * @author Iris
 */
public class RepositorioConta {
    private ArrayList<Conta> listaConta;

public RepositorioConta(){
    this.listaConta=new ArrayList();
}
public void adcionarConta(Conta conta){
   
    this.listaConta.add(conta);//metodos letra minuscula
}

public Conta procurarConta(String numero){
   Conta retorno=null;
    for (int i=0;i<=this.listaConta.size();i++){
        if(this.listaConta.get(i).getNumero().equals(numero)){
            retorno=this.listaConta.get(i);
            break;
           
            
        }
                  
        }
    return retorno;
    }

public void excluirConta(Conta c){
   
    if(null!=c){
        System.out.println("Conta inexistente");
    }
    else{
        this.listaConta.remove(c);
    }
}
}





