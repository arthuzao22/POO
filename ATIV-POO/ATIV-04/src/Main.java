import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("INFORME A LARGURA");
        double largura = read.nextDouble();

        System.out.println("INFORME O COMPRIMENTO");
        double comprimento = read.nextDouble();

        // Create a Retangulo object
        Retangulo r = new Retangulo(largura, comprimento);

        System.out.println("A ÁREA DO RETÂNGULO É DE: " + r.CalcularArea());
        System.out.println("O PERÍMETRO DO RETÂNGULO É DE: " + r.CalcularPerimetro());

        read.close();
    }
}