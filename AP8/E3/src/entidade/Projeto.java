package entidade;



/**
 *
 * @author Iris
 */
public class Projeto {
    
    private String descricao;
    private String codigo;
    private String dataInicio;
    
    
public Projeto(String descricao,String codigo,String dataInicio){
    this.descricao=descricao;
    this.dataInicio=dataInicio;
    this.codigo=codigo;
}

    public String getDescricao(){
        return descricao;
    }
    
    public String getCodigo(){
    return codigo;
}
    public String getDataInicio(){
        return dataInicio;
    }
    
   public void setDescricao(String novoDescricao){
        this.descricao=novoDescricao;
    }
   public String toString(){
       return("Descricao="+this.descricao+"\ncodigo="+this.codigo+"\ndata de inicio="+this.dataInicio);
   }

}
