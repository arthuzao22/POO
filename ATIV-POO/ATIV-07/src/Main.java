import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = read.nextInt();

        System.out.println("Informe seu tempo de trabalho: ");
        int tempotrabalho = read.nextInt();

        VerificClas v = new VerificClas(idade, tempotrabalho);

        System.out.println(v.calculoTB());
    }
}