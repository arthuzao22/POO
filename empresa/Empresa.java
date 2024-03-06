//empresa
public class Empresa
{
    private String nome;
    private Funcionarios[] funcionarios;
    
    public Empresa(){}
    public Empresa(String fnome){
        nome = fnome;
        funcionarios = new Funcionarios[20];
    }
    
    public Funcionarios funcionarioMaiorSalario(){
        if (funcionarios[0] == null){
           return null;   
        }
        Funcionarios maior = funcionarios[0];
        for(int i = 1; i < funcionarios.length ; i++){
            if (funcionarios[i] != null){
                 if ( funcionarios[i].salarioLiq() > maior.salarioLiq() ){
                     maior = funcionarios[i];
                 }
            }
        }
        
        return maior;
    }
    
    public double somaSalarios(){
        double soma = 0;
        for(int i = 0; i < funcionarios.length ; i++){
            if (funcionarios[i] != null){
                soma += funcionarios[i].salarioLiq();
            }
        }
        
        return soma;
    }
    
    public void setNome(String novoNome){
        nome = novoNome;
    }
    public String getNome(){
        return nome;
    }
    
    
    public Funcionarios[] getFuncionarios(){
        return funcionarios;
    }
    public void addFuncionarios(Funcionarios newFunc){
        for (int i = 0; i < funcionarios.length; i++){
           if(funcionarios[i] == null){
               funcionarios[i] = newFunc;
               return;
           }
        }
    }

    
    
}

