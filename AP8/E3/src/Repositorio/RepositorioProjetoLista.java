package Repositorio;

import Repositorio.IRepositorioProjeto;
import entidade.Projeto;
import java.util.ArrayList;

/**
 *
 * @author Iris
 */
public class RepositorioProjetoLista implements IRepositorioProjeto{
    private ArrayList<Projeto> listaProjetos;
    
    
public RepositorioProjetoLista (){
    this.listaProjetos=new ArrayList();
}

    @Override
    public void adicionar(Projeto projeto) {
        Projeto verificaProjeto=buscarCodigo(projeto.getCodigo());
    if(verificaProjeto!=null){
         System.out.println("projeto ja adicionada");}
    else{
    listaProjetos.add(projeto);
    }
    }

    @Override
    public void remover(Projeto projeto) {
       if(null!=projeto){
        System.out.println("Projeto inexistente");
    }
    else{
        this.listaProjetos.remove(projeto);
    }
    }

    @Override
    public Projeto buscarCodigo(String  codigo) {
        Projeto retorno=null;
        int tamanho=this.listaProjetos.size();
        for (int i=0;i<tamanho;i++){
        if(this.listaProjetos.get(i).getCodigo().equals(codigo)){
            retorno=this.listaProjetos.get(i);
            break;
            
            
        }
                  
        }
    return retorno;
    }

    @Override
    public ArrayList<Projeto> buscarString(String descricao) {
        ArrayList<Projeto> retorno=new  ArrayList();
        
        int tamanho=this.listaProjetos.size();
        for (int i=0;i<tamanho;i++){
        if(this.listaProjetos.get(i).getDescricao().equals(descricao)){
            retorno.add(listaProjetos.get(i));
            
            
            
        }
                  
        }
    return retorno;
    }

}
