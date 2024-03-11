import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.println("INFORME O PRIMEIRO LADO DO TRIANGULO");
        double lado1 = read.nextDouble();
        System.out.println("INFORME O SEGUNDO LADO DO TRIANGULO");
        double lado2 = read.nextDouble();
        System.out.println("INFORME O TERCEIRO LADO DO TRIANGULO");
        double lado3 = read.nextDouble();

        CalcTriangulo c = new CalcTriangulo(lado3, lado2, lado1);

        System.out.println("AREA: " + c.CalcArea());
        System.out.println("PERIMETRO: " + c.CalcPerimetro());
        System.out.println(c.VerifcTri());

        read.close();
    }
}