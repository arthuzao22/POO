
public class Aluno
{
    // declarar atributos 
    private String nome;
    private double nota;
    
    // Metodo construtor (ele so e construtor pois nao tem retorno)
    public Aluno(String nNome, double nNota){
        nome = nNome;
        nota = nNota;
    }
    
    // Passando somente o nome
    public Aluno(String nNome){
        nome = nNome;
        nota = 0;
    }
    
    // declarar metodos (funcoes e procedimentos)
    public boolean aprovado(){
        if (nota >= 7){
            return true;
        }else{
            return false;
        }
    }
    
    
    // parametro (set)
    public void setNota(double novaNota){
        if (novaNota >= 0 && novaNota <= 10){
            nota = novaNota;
        }
    }
    // vai retornar/ mostrar a nota do procedimento a cima (get)
    public double getNota(){
        return nota;
    }
    
    
     // parametro (set)
    public void setNome(String novoNome){
        if (novoNome != null){
            nome = novoNome;
        }
    }
    // vai retornar/ mostrar a nota do procedimento a cima (get)
    public String getNome(){
        return nome;
    }
    
}
