/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeracional;

/**
 *
 * @author Iris
 */
public class Racional {
    static int novoNumerador;
    static int novoDenominador;
Racional(){
    novoNumerador=0;
    novoDenominador=0;
}
static void reduzirFracao(int numerador,int denominador){// CASO O NUMERADOR SEJA MAIOR QUE O DENOMINADOR
    if(numerador > denominador){ 
            for(int i = 2; i <= denominador; i++){
               if(numerador % i == 0 && denominador % i == 0){
                  Racional.novoNumerador = numerador / i; 
                  Racional.novoDenominador = denominador / i;
               }
            }
    if(novoNumerador == 0 && novoDenominador == 0){
               System.out.println("A fração " + numerador + "/" + denominador + " não pode ser simplificada!");
            }      
    }
    else if(numerador < denominador){ // CASO O DENOMINADOR SEJA MAIOR QUE O NUMERADOR
            for(int i = 2; i <= numerador; i++){
               if(numerador % i == 0 && denominador % i == 0){
                  Racional.novoNumerador = numerador / i; 
                  Racional.novoDenominador = denominador / i;
               }
            }
    if(novoNumerador == 0 && novoDenominador == 0){
               System.out.println("A fração " + numerador + "/" + denominador + " não pode ser simplificada!");
            }
            
}
 else if(numerador == denominador){ // CASO OS NÚMEROS SEJAM IGUAIS
              Racional.novoNumerador=1;
              Racional.novoDenominador=1;
}
 else{
     Racional.novoNumerador=numerador;
     Racional.novoDenominador=denominador;
 }
    
}
}
