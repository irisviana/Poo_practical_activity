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
public class Conta {
   private String numero; 
   private  double saldo; 
   private Cliente cliente;

public Conta(String numero,Cliente cliente){
    this.numero=numero;
    this.saldo=0;
    this.cliente=cliente;
}
public String getNumero(){
    return numero;
}
public double getSaldo(){
    return saldo;
}
public Cliente getCliente(){
    return cliente;
}
public void creditar(double valor){
    this.saldo+=valor;
}
public void transferir(Conta c,double valor){
   
   if(this.debitar(valor)==1){
       c.creditar(valor);
   }
}
public int debitar(double valor){
    int verificar=-1;
     if(valor<=this.saldo){
         this.saldo-=valor;
         verificar=1;
     }
    return verificar;
}
}
