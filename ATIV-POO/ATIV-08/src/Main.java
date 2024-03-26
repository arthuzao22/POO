import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>(); // cria um array para armazenar os produtos

        boolean sn;
        System.out.println("Você deseja inserir um produto? (s)im (n)ão");
        sn = read.nextBoolean();
        read.nextLine(); // Limpa o buffer do scanner

        while (sn) {
            System.out.println("INFORME O NOME DO PRODUTO: ");
            String nome = read.nextLine();

            System.out.println("INFORME O CÓDIGO DE BARRAS: ");
            String codBarras = read.nextLine();

            System.out.println("INFORME O PREÇO DESEJADO PARA COLOCAR NO PRODUTO: ");
            double preco = read.nextDouble();

            System.out.println("INFORME A QUANTIDADE: ");
            int qtde = read.nextInt();

            Produto p = new Produto(nome, codBarras, preco, qtde);
            produtos.add(p); // adiciona um novo produto no ArrayList

            System.out.println("Você deseja inserir mais um produto? (true ou false)");
            sn = read.nextBoolean();
            read.nextLine(); // Limpa o buffer do scanner
        }

        boolean listar;
        System.out.println("Você deseja listar os produtos? (true ou false)");
        listar = read.nextBoolean();

        if (listar) {
            System.out.println("\nLista de Produtos:");
            for (Produto produto : produtos) {
                produto.exibirInformacoes();
                System.out.println(); // Adiciona uma linha em branco entre os produtos
            }
        }

        read.close(); // Fecha o Scanner
    }
}
