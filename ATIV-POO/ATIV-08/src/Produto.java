public class Produto {
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

    //métodos
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Codigo de barras: " + codBarras);
        System.out.println("preco: " + preco);
        System.out.println("QTDE: " + qtde);
    }



}
