import java.util.ArrayList;
public class Produto {
    ArrayList<Produto> produtos = new ArrayList<>(); // cria um array para armazenar os produtos
    private String nome;
    private String codBarras;
    private double preco;
    private int qtde;

    //Construtor
    public Produto(String nome, String codBarras, double preco, int qtde){
        this.nome = nome;
        this.codBarras = codBarras;
        this.preco = preco;
        this.qtde = qtde;
    }

    //Get
    public String getNome(){
        return nome;
    }
    public String getCodBarras(){
        return codBarras;
    }
    public double getPreco(){
        return preco;
    }
    public int getQtde(){
        return qtde;
    }

    // Set
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCodBarras(String codBarras){
        this.codBarras = codBarras;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setQtde(int qtde){
        this.qtde = qtde;
    }

    // MÉTODOS
    public double calcPreco(ArrayList<Produto> produtos){
        for (Produto produto : produtos) {
            double soma = 0 ;
            return soma += getPreco() * getQtde();
        }
        return 0;
    }

}
