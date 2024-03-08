import java.util.ArrayList;
public class Banco
{
    private String nome, sigla;
    private Gerente gerente;
    //private Endereco endereco;
    private ArrayList<Bancario> bancarios;
    
    public Banco(){
        
    }
    // metodos GET - SET
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    public String getSigla(){
        return this.sigla;
    }
}
