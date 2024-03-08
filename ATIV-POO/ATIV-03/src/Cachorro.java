class Cachorro {
    private String nome;
    private int idade;
    private String raca;

    //método constructor
    public Cachorro(String nNome, int nIdade, String nRaca){
        nome = nNome;
        this.idade = nIdade;
        raca = nRaca;
    }

    //methods de access
    public void setIdade(int nIdade) {
        this.idade = nIdade;
    }
    public int getIdade() {
        return idade;
    }

    public void setNome(String nNome){
        nome = nNome;
    }
    public String getNome(){
        return nome;
    }

    public void setRaca(String nRaca){
        raca = nRaca;
    }
    public String getRaca(){
        return raca;
    }

    public boolean verificarIdade() {
        if (idade > 10) {
            return true;
        } else {
            return false;
        }
    }

}