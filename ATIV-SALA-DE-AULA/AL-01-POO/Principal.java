
public class Principal
{
    public static void main(String args[]){
        Aluno a1, a2;
        
        a1 = new Aluno("arthur", 8);
        a2 = new Aluno("pedro", 6);
        
        a1.setNota( 5 );
        
        if (a1.aprovado()){
            System.out.println(a1.getNome() + "ESTA APROVADO" + a1.getNota());
        }else{
            System.out.println(a1.getNome() + "ESTA REPROVADO");
        }
    }
}
