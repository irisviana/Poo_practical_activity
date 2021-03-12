/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import entidade.Cliente;
import java.util.ArrayList;
/**
 *
 * @author Iris
 */
public class RepositorioCliente {
     private ArrayList<Cliente> listaCliente;

public RepositorioCliente(){
    this.listaCliente=new ArrayList();
}
public void adcionarCliente(Cliente cliente){
   
    this.listaCliente.add(cliente);//metodos letra minuscula
}

public Cliente procurarCliente(String cpf){
   Cliente retorno=null;
    for (int i=0;i<=this.listaCliente.size();i++){
        if(this.listaCliente.get(i).getNome().equals(cpf)){
            retorno=this.listaCliente.get(i);
            break;
           
            
        }
                  
        }
    return retorno;
    }

public void excluirCliente(Cliente c){
   
    if(null!=c){
        System.out.println("Cliente inexistente");
    }
    else{
        this.listaCliente.remove(c);
    }
}
}



