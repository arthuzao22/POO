import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>(); // cria um array para armazenar os produtos

        Menu(produtos); // chamar o método menu

    }

    // USADO PARA FAZER O MENU E TE LEVAR PARA O LUGAR
    public static void Menu(ArrayList<Produto> produtos){
        Scanner read = new Scanner(System.in);

        int Menu = 0;
        System.out.println("---------- - MENU - -----------");
        System.out.println("--------- LISTAR  - 1 ---------");
        System.out.println("--------- INSERIR - 2 ---------");
        System.out.println(" ");

        System.out.println(" INFORME OQUE VOCE QUER FAZER: ");
        Menu = read.nextInt();
        if (Menu == 1){
            ListarProd(produtos);
        } else if (Menu == 2) {
            InserirProd(produtos);
        } else {
            System.out.println("ATÉ A PROXIMA!!!");
        }
    }

    // USADO PARA INSERIR O PRODUTO
    public static void InserirProd(ArrayList<Produto> produtos){
        Scanner read = new Scanner(System.in);
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
        Menu(produtos); // volta para o método MENU
    }

    // LISTAR OS PRODUTOS
    public static void ListarProd(ArrayList<Produto> produtos){

        System.out.println("\nLista de Produtos:");
            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Código de Barras: " + produto.getCodBarras());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Quantidade: " + produto.getQtde());
                System.out.println();
            }
        Menu(produtos); // volta para o método MENU
    }
}
