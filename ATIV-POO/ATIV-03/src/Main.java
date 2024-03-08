import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("INFORME O NOME DO CACHORRO: ");
        String nome = read.next();

        System.out.println("INFORME A IDADE DO CACHORRO: ");
        int idade = read.nextInt();

        System.out.println("INFORME A RAÇA DO CACHORRO: ");
        String raca = read.next();

        Cachorro c = new Cachorro(nome, idade, raca);

        System.out.println("O cachorro do Nome: " + c.getNome());
        System.out.println("Idade do cachorro: " + c.getIdade());
        System.out.println("Raça do cachorro: " + c.getRaca());

        if (c.verificarIdade()){
            System.out.println("Ele esta idoso" );
        }else {
            System.out.println("Ele esta Novo" );
        }

        read.close();
    }
}