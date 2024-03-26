public class VerificClas {
    private int idade;
    private int tempotrabalho;
    public VerificClas(int tempotrabalho, int idade){
        this.tempotrabalho = tempotrabalho;
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public int getTempotrabalho(){
        return tempotrabalho;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setTempotrabalho(int tempotrabalho){
        this.tempotrabalho = tempotrabalho;
    }


    public int verificarIdade(){
        if (idade >= 65){
            return 1;
        } else if (idade >= 60) {
            return 2;
        }
        return 0;
    }
    public int verificarTrabalho(){
        if (tempotrabalho >= 30){
            return 1;
        } else if (tempotrabalho >= 25) {
            return 2;
        }
        return 0;
    }
    public boolean calculoTB(){
        if (idade >= 65 || tempotrabalho >= 30) {
            return true;
        } else if (idade >= 60 && tempotrabalho >= 25) {
            return true;
        } else {
            return false;
        }
    }
}
