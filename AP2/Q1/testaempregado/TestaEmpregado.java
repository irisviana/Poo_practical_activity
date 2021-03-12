/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaempregado;
import java.util.Scanner;

public class TestaEmpregado {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nome;
        String sobrenome;
        double salario_Mensal;
        
        System.out.println("Digite seu nome");
        nome=sc.nextLine();
        System.out.println("Digite seu sobrenome");
        sobrenome=sc.nextLine();
        System.out.println("Digite o valor do seu salario mensal");
        salario_Mensal=sc.nextDouble();
        Empregado Iris=new Empregado(nome,sobrenome,salario_Mensal);
        Iris.Salario_Anual();
    }
    
}
