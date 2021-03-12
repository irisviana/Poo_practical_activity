package testaempregado;




public class Empregado {
    public String Nome;
    public String Sobrenome;
    public double SalarioMensal ;
    public double SalarioAnual;
    
    
    public Empregado(String Nome,String Sobrenome,double SalarioMensal){
        this.Nome=Nome;
        this.Sobrenome=Sobrenome;
        
        
        if(SalarioMensal<0){
        
        this.SalarioMensal=0;
                
           }
        else{
            this.SalarioMensal=SalarioMensal;
        }
    }
    
           
    
    public void Salario_Anual(){
        SalarioAnual=SalarioMensal*12;
        System.out.println("Salario anual antes e depois do reajuste mensal de dez por cento:");
        System.out.println(SalarioAnual);
        SalarioAnual=(((SalarioMensal*0.1)*12)+SalarioAnual);
        System.out.println(SalarioAnual);
    }
   

      
   }

