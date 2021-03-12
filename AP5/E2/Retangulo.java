/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retanguloteste;

/**
 *
 * @author Iris
 */
public class Retangulo {
   private double altura;
   private double largura;
 
public Retangulo(){
    this.altura=1;
    this.largura=1;
}

public double getAltura(){
    return altura;
}
public double getLargura(){
    return largura;
}
public void setAltura(double mudaAltura){
    if(mudaAltura>0.0 && mudaAltura<20.0){
        altura=mudaAltura;
    }
    else{
        System.out.println("altura invalida");
    }
}
public void setLargura(double mudaLargura){
    if(mudaLargura>0.0 && mudaLargura<20.0){
        largura=mudaLargura;
    }
    else{
        System.out.println("largura invalida");
    }
}
public  double calcularPerimetro(double a,double l){
    
    double perimetro;
    perimetro=(2*a)+(2*l);
    return perimetro;
}
public  double calcularArea(double a,double l){
    double area;
    area=a*l;
    return area;
}
    
}


