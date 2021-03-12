
package testequestao2;

/**
 *
 * @author Iris
 */
public class TesteQuestao2 {

    
    public static void main(String[] args) {
        Agenda agenda=new Agenda();
        
        Pessoa amigo1=new Amigo("ju",18,"08/08/1999");
        Pessoa conhecido1=new Conhecido("kary",21,"karySantana12@gmail.com");
        
       Pessoa amigo2=new Amigo("che",23,"21/02/1995");
       Pessoa conhecido2=new Conhecido("kamily",14,"kamilySantana12@gmail.com");
         
        
        agenda.addAgenda(amigo1);
        agenda.addAgenda(conhecido1);
        
        agenda.addAgenda(amigo2);
        agenda.addAgenda(conhecido2);
        
        System.out.println(agenda.contarAmigos());
        System.out.println(agenda.contarConhecidos());
        
        agenda.mostrarInformacoesAmigos();
        agenda.mostrarInformacoesConhecidos();
    
      

}
}
