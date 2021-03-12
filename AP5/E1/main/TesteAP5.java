/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import entidade.Cliente;
import entidade.Conta;
import entidade.Endereco;
import repositorio.RepositorioCliente;
import repositorio.RepositorioConta;
import repositorio.RepositorioEndereco;
/**
 *
 * @author Iris
 */
public class TesteAP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Endereco endereco1=new Endereco("sao sebastiao","angelita","55310000");
        Endereco endereco2=new Endereco("sao benedito","maria viana","55310000");
        
        Cliente cliente1=new Cliente("Iris","123.321.345-18",endereco1);
        Cliente cliente2=new Cliente("Iara","657.098.890-13",endereco2);
        
        Conta conta1=new Conta("123321213",cliente1);
        Conta conta2=new Conta("875443315",cliente2);
        
        RepositorioConta c1=new RepositorioConta();
        c1.adcionarConta(conta1);
        c1.adcionarConta(conta2);
        
        RepositorioEndereco e1= new  RepositorioEndereco();
        e1.AdcionarEndereco(endereco1);
        e1.AdcionarEndereco(endereco2);
        
        RepositorioCliente cli1=new RepositorioCliente();
        cli1.adcionarCliente(cliente1);
        cli1.adcionarCliente(cliente2);
        cli1.excluirCliente(cliente2);
        
    }
    
}
