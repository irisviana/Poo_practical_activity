/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author Iris
 */
public class Endereco {
   
     private String bairro;
     private String rua;
     private String  cep;
  
public Endereco(String b,String r,String c){
    
    this.bairro=b;
    this.rua=r;
    
    this.cep=c;
}

public String getBairro(){
    return bairro;
}
  
 public String getRua(){
    return rua;
}
 
public String getCep(){
    return cep;
} 

public void setBairro(String nomeBairro){
    this.bairro=nomeBairro;
}

public void setRua(String nomeRua){
    this.rua=nomeRua;
}

}


