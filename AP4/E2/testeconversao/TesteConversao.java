/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeconversao;

 
public class TesteConversao {

   
    public static void main(String[] args) {
       
        System.out.println(ConversaoDeUnidadesDeTempo.CoverteParaMin(60));
        System.out.println(ConversaoDeUnidadesDeTempo.CoverteParaHora(120));
        System.out.println(ConversaoDeUnidadesDeTempo.CoverteParaDia(72));
        System.out.println(ConversaoDeUnidadesDeTempo.CoverteParaSemana(21));
        System.out.println(ConversaoDeUnidadesDeTempo.CoverteParaMes(240));
        System.out.println(ConversaoDeUnidadesDeTempo.CoverteParaAno(660));
        
    }
}