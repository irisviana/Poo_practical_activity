package Repositorio;
import Repositorio.IRepositorioProjeto;
import entidade.Projeto;
import java.util.ArrayList;



/**
 *
 * @author Iris
 */
public class RepositorioProjetoVetor implements IRepositorioProjeto{
    private Projeto[] listaProjeto;
    private int tamanho;
    
    
public RepositorioProjetoVetor(){
    this.tamanho=20;
    this.listaProjeto=new Projeto[tamanho];
}


    @Override
    public void adicionar(Projeto projeto) {
        boolean adicionou = false;
     
     for(int i=0; i<listaProjeto.length; i++){
        if(listaProjeto[i] == null){
                listaProjeto[i] = projeto;
                adicionou = true;
                break;
        }
        }
        if(!adicionou){
            System.out.println("ERRO: O repositório está cheio!");
            
}

    }

    @Override
    public void remover(Projeto projeto) {
      
        
        for(int i=0; i<listaProjeto.length; i++){
        if(listaProjeto[i]!=null &&
            listaProjeto[i].getCodigo().equals(projeto.getCodigo())){
            if(listaProjeto[i] !=null){
                listaProjeto[i] = null;
        }
        else{
            System.out.println("projeto existente");
    }
    }
        }
        }

    @Override
    public  Projeto buscarCodigo(String codigo) {
        Projeto projetoProcurado =null;

        for(int i=0; i<listaProjeto.length; i++){
        if(listaProjeto[i]!=null &&
            listaProjeto[i].getCodigo().equals(codigo)){
           projetoProcurado=listaProjeto[i];
            break;
        }
        }
        return projetoProcurado;
    }

    @Override
    public ArrayList<Projeto> buscarString(String descricao) {
         ArrayList<Projeto> retorno=new  ArrayList();
        

        for(int i=0; i<listaProjeto.length; i++){
        if(listaProjeto[i]!=null &&
            listaProjeto[i].getDescricao().equals(descricao)){
              retorno.add(listaProjeto[i]);
            
        }
        }
        return retorno;
    }
    }
    


   
