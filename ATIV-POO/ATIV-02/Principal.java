import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] valores = new int[10];
        vetoresVerifc v = new vetoresVerifc(valores, valores);

        for (int i = 0; i < valores.length; i++) {
            System.out.println("INFORME O NUMERO A:");
            valores[i] = (read.nextInt());
        }

        int[] armazenarImpares = v.verificarImparesA();
        for (int i = 0; i < armazenarImpares.length; i++) {
            if (armazenarImpares[i] != 0) {
                System.out.println(armazenarImpares[i]);
            }
        }
        read.close();
    }
}
