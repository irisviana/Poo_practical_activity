package question2;



/**
 *
 * @author Iris
 */
public class Pessoa implements Identificavel,Printavel{
    private String nome;
    private int idade;
    private String cpf;
    private int id;
    
public Pessoa(String nome,int idade,String cpf,int id){
    this.nome=nome;
    this.idade=idade;
    this.cpf=cpf;
    this.id=id;
}

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public void print() {
        System.out.printf("Meu nome e %s e tenho %d anos",this.nome,this.idade);
    }
}
