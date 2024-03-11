import java.util.Scanner; // serve para importar a biblioteca para ler o teclado
public class Main { //calcPotencia() + calcAr() + calcCambio() + calcAlarme() + calcPintura() + calcTeto() + calcMult();
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("INFORME O MODELO DO CARRO ESCOLHIDO: ");
        System.out.println("------------- GOL -> 1 ------------: ");
        System.out.println("------------- POLO -> 2 -----------: ");
        System.out.println("------------ JETTA -> 3 -----------: ");
        System.out.println("------------ NIVUS -> 4 -----------: ");
        int modeloCarro = read.nextInt();

        System.out.println("INFORME A POTENCIA DO CARRO ESCOLHIDO: ");
        double potencia = read.nextDouble();

        System.out.println("CARRO COM AR CONDICIONADO? ");
        boolean ar = read.nextBoolean();

        System.out.println("CARRO COM CAMBIO AUTOMATICO? ");
        boolean cambio = read.nextBoolean();

        System.out.println("CARRO COM ALARME? ");
        boolean alarme = read.nextBoolean();

        System.out.println("CARRO COM PINTURA DIFERENCIADA? ");
        boolean pintura = read.nextBoolean();

        System.out.println("CARRO COM TETO SOLAR? ");
        boolean teto = read.nextBoolean();

        System.out.println("CARRO COM MULTIMIDIA? ");
        boolean multimidia = read.nextBoolean();

        CARRO c = new CARRO(cambio, ar, alarme, teto, multimidia, potencia, modeloCarro, pintura);
        System.out.println(c.calcTot());
    }
}   
