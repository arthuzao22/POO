public class CARRO {
    private int modeloCarro;
    private boolean cambio;
    private boolean alarme;
    private boolean teto;
    private boolean multimidia;
    private double potencia;
    private boolean ar;
    private boolean pintura;

    public CARRO(boolean cambio, boolean ar, boolean alarme, boolean teto, boolean multimidia, double potencia, int modeloCarro, boolean pintura) {
        this.cambio = cambio;
        this.alarme = alarme;
        this.teto = teto;
        this.multimidia = multimidia;
        this.potencia = potencia;
        this.modeloCarro = modeloCarro;
        this.ar = ar;
        this.pintura = pintura;
    }

    public boolean getPintura() {
        return pintura;
    }

    public boolean getAr() {
        return ar;
    }

    public int getModeloCarro() {
        return modeloCarro;
    }

    public boolean getCambio() {
        return cambio;
    }

    public boolean getAlarme() {
        return alarme;
    }

    public boolean getTeto() {
        return teto;
    }

    public boolean getMultimidia() {
        return multimidia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setCambio(boolean cambio) {
        this.cambio = cambio;
    }


    public void setAlarme(boolean alarme) {
        this.alarme = alarme;
    }

    public void setTeto(boolean teto) {
        this.teto = teto;
    }

    public void setMultimidia(boolean multimidia) {
        this.multimidia = multimidia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void setModeloCarro(int modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public void setAr(boolean ar) {
        this.ar = ar;
    }

    public void setPintura(boolean pintura) {
        this.pintura = pintura;
    }
    //--------------------------------
    public int calcModelo(){
        if (modeloCarro == 1){ //gol
            return 50000;
        }else if (modeloCarro == 2) { //polo
            return 60000;
        } else if (modeloCarro == 3) { //jetta
            return 100000;
        } else if (modeloCarro == 4) { //nivus
            return 110000;
        }
        return 0;
    }
    public double calcPotencia(){
        if (potencia <= 1){
            return (calcModelo() * 0.10) + calcModelo();
        } else if (potencia > 1) {
            return (calcModelo() * 0.20) + calcModelo();
        }
        return 0;
    }
    public double calcAr(){
        if (ar == true){
            return 3000;
        }else{
            return 0;
        }
    }
    public double calcCambio(){
        if (cambio == true){
            return 5000;
        }else{
            return 0;
        }
    }
    public double calcAlarme(){
        if (alarme == true){
            return 800;
        }else{
            return 0;
        }
    }
    public double calcPintura(){
        if (pintura == true){
            return 2500;
        }else {
            return 0;
        }
    }
    public double calcTeto(){
        if (teto == true){
            return 4000;
        }else{
            return 0;
        }
    }
    public double calcMult(){
        if (multimidia == true){
            return 1800;
        }else{
            return 0;
        }
    }
    public double calcTot(){
        return calcPotencia() + calcAr() + calcCambio() + calcAlarme() + calcPintura() + calcTeto() + calcMult();
    }
}
