package Repositorio;


import entidade.Projeto;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iris
 */

public interface  IRepositorioProjeto {
    
    
    
    void adicionar(Projeto projeto);
    
    void remover(Projeto projeto);
    
    Projeto buscarCodigo(String  codigo);
    
    ArrayList<Projeto> buscarString(String descricao);
}
