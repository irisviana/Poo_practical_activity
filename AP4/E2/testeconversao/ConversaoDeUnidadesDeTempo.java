/**
 *Essa classe representa conversao de unidades de tempo.
 *Essa classe possui apenas metodos estaticos e os mesmos nao dependem de variaveis de instancias!
 * @author Iris Viana.
 * @version 1.0
 */
package testeconversao;


public class ConversaoDeUnidadesDeTempo {
    
    /**
     * Esse parametro segundos do metodo CoverteParaMin,indica a quantidade de segundos que sera necessario
     *transformar em minutos.
     * @param segundos 
     
     * @return minutos
     */
    
   
 public  static double CoverteParaMin(double segundos) {
    
    double minutos=segundos/60;
    return minutos;
      
  }
 /**
  * Esse parametro min do metodo CoverteParaHora,indica a quantidade de minutos que sera necessario
  *transformar em hora.
  * @param min
 
  * @return hora
  */
 public  static double CoverteParaHora(double min) {
      
      double hora=min/60;
      return hora;
  }
  /**
   * Esse parametro hora do metodo CoverteParaDia,indica a quantidade de horas que sera necessaria
   *transformar em dias.
   * @param hora
 
   * @return dia
   */
 public  static double CoverteParaDia(double hora) {
     
     double dia=hora/24;
      return dia;
  }
 /**
  *Esse parametro dias do metodo CoverteParaSemana,indica a quantidade de dias que sera necessario
  *transformar em semana.
  * @param dias
 
  * @return semana
  */
 public static double CoverteParaSemana(double dias) {
     
     double  semana=dias/7;
      return semana;
  }
 /**
  * Esse parametro dias do metodo CoverteParaMes,indica a quantidade de dias que sera necessario
  *transformar em mes.
  * @param dias
  
  * @return mes
  */
 public static double CoverteParaMes(double dias) {
    
     double  mes=dias/30;
      return mes;
  }
 /**
  *Esse parametro dias do metodo CoverteParaAno,indica a quantidade de dias que sera necessario
     *transformar em anos.
  * @param dias
  
  * @return ano
  */
 public static double CoverteParaAno(double dias) {
     
     double ano=dias/365.25;
      return ano;
  }
 
 
  }
  

