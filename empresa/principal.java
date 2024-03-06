import java.util.Scanner; // serve para importar a biblioteca para ler o teclado

public class principal
{
    public static void main(String[] args){
    Empresa emp = new Empresa();
    Scanner read = new Scanner(System.in);
    
    System.out.println("##informe o nome da empresa");
    emp.setNome(read.next());
    
    while(true){
        System.out.println("informe os dados dos funcionarios");
        Funcionarios f = new Funcionarios();

        System.out.println("##salario");
        f.setsalario(read.nextDouble());
        
        System.out.println("##nome");
        f.setNome(read.next());
        
        System.out.println("##funcao");
        f.setFuncao(read.next());
        
        System.out.println("##numero de filhos");
        f.setFilhos(read.nextInt());
        
        System.out.println("##Numero de filhos");
        f.setFilhos(read.nextInt());
        
        System.out.println("##Vale transporte");
        f.setTValetransporte(read.nextBoolean());
        
        System.out.println("##Trabalha a noite");
        f.setTrabalhaNoite(read.nextBoolean());
        
        if (f.getFuncao().equals("vendedor")){
            System.out.println("##total vendas");
            f.setVendastot(read.nextDouble());
        }
        
        emp.addFuncionarios(f);
        System.out.println("deseja cadastrar um novo? (S)sim");
        if(!read.next().equals("S")){
            break;
        }
    }
    }
    
}
