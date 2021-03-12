/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import entidade.Endereco;
import java.util.ArrayList;
/**
 *
 * @author Iris
 */
public class RepositorioEndereco {
    private ArrayList<Endereco> listaEndereco;
    
public RepositorioEndereco(){
    this.listaEndereco=new ArrayList();
}
public void AdcionarEndereco(Endereco endereco){
   
    this.listaEndereco.add(endereco);//metodos letra minuscula
}

public Endereco ProcurarEndereco(Endereco endereco){
   Endereco retorno=null;
    for (int i=0;i<=this.listaEndereco.size();i++){
        if(this.listaEndereco.get(i).equals(endereco)){
            retorno=endereco;
            break;
            
            
        }
                  
        }
    return retorno;
    }

public void ExcluirEndereco(Endereco endereco){
    Endereco i=ProcurarEndereco(endereco);
    if(i!=null){
        this.listaEndereco.remove(endereco);
    }
    else{
        System.out.println("Endereco inexistente");
    }
}

}


