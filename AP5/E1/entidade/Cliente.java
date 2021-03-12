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
public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;
    
public Cliente (String nome,String cpf,Endereco endereco){
    this.nome=nome;
    this.cpf=cpf;
    this.endereco=endereco;
}   

public String getNome(){
    return nome;
}
public String getCpf(){
    return cpf;
}
public Endereco getEndereco(){
    return endereco;
}
public void setNome(String nome){
    this.nome=nome;
}
public void setEndereco(Endereco mudaEndereco){
    this.endereco=mudaEndereco;
   
}
}
