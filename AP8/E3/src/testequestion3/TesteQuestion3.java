/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testequestion3;

import Repositorio.RepositorioProjetoLista;
import Repositorio.IRepositorioProjeto;
import Repositorio.RepositorioProjetoVetor;
import entidade.Projeto;
import java.util.ArrayList;

/**
 *
 * @author Iris
 */
public class TesteQuestion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Projeto projeto1=new Projeto("hello world","01","29/12/2017");
        RepositorioProjetoLista rep1=new RepositorioProjetoLista();
        RepositorioProjetoVetor rep2=new RepositorioProjetoVetor();
        
        rep1.adicionar(projeto1);
        rep2.adicionar(projeto1);
        ArrayList<Projeto>  v=rep1.buscarString("hello world");
        for(int i=0;i< v.size();i++){
            System.out.println( v.get(i));
        }
        System.out.println(rep1.buscarCodigo("00"));
        System.out.println(rep1.buscarCodigo("01"));
        
        System.out.println(rep2.buscarCodigo("00"));
        System.out.println(rep2.buscarCodigo("01"));
        System.out.println( rep1.buscarString("vaca"));
        
        rep1.remover(projeto1);
        rep1.remover(projeto1);
        
        rep2.remover(projeto1);
        rep2.remover(projeto1);
        
        
        
    }
    
}
