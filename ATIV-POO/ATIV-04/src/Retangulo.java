public class Retangulo {
    private double comprimento;
    private double largura;
    public Retangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }
    public double getComprimento(){
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double CalcularArea(){
        return comprimento * largura;
    }
    public double CalcularPerimetro(){
        return 2 * (largura + comprimento);
    }
}
