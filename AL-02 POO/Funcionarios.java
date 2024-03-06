public class Funcionarios {
    double salario;
    String nome;
    String funcao;
    boolean trabalhaNoite;
    int filhos;
    boolean valetransporte;
    double vendastot;


    // Metodo construtor
    public Funcionarios(double nSalario, String nNome, String nFuncao, boolean nTrabalhaNoite, int nFilhos, boolean nValetransporte, double nVendastot) {
        salario = nSalario;
        nome = nNome;
        funcao = nFuncao;
        trabalhaNoite = nTrabalhaNoite;
        filhos = nFilhos;
        valetransporte = nValetransporte;
        vendastot = nVendastot;
        setsalario(nSalario);
    }
    
    //salario
    public void setsalario(double nSalario) {
        if (salario > 0) {
            salario = nSalario;
        }
    }
    public double getSalario(){
        return salario;
    }
    
    //nome
    public void setNome(String nNome) {
            nome = nNome;
    }
    public String getNome(){
        return nome;
    }
    
    //funcao
    public void setFuncao(String nfuncao){
        funcao = nfuncao;
    }
    public String getFuncao(){
        return funcao;
    }
    
    // trabalhaNoite
    public void setTrabalhaNoite(boolean ntrabalhaNoite){
        trabalhaNoite = ntrabalhaNoite;
    }
    public boolean getTrabalhaNoite(){
        return trabalhaNoite;
    }
    
    //filhos
    public void setFilhos(int nFilhos){
        filhos = nFilhos;
    }
    public int getFilhos(){
        return filhos;
    }
    
    //valetransporte
    public void setTValetransporte(boolean nValetransporte){
        valetransporte = nValetransporte;
    }
    public boolean getValetransporte(){
        return valetransporte;
    }
    
    //vendastot
    public void setVendastot(double nVendastot){
        vendastot = nVendastot;
    }
    public double getVendastot(){
        return vendastot;
    }
    
    
    // calculo inss
    public double inss(){
        return salario * 0.13;
    }
    
    public double bonusGerente(){
                    // Verifica se é gerente ou vendedor
        if (funcao.equals("gerente")) {
            return  salario * 0.10;
        } 
        return 0;            
    }
    
    public double bonusVendedor(){
        if (funcao.equals("vendedor")) {
            return vendastot * 0.02;
        }
        return 0;  
    }
    
    public double descontovaleTransporte(){
        if (valetransporte) {
            return salario * 0.03;
        }
            return 0;  
    }
    public double bonusTrabalhoNoturno(){
       return salario * 0.02;
    }
    
    public double bonusFilho(){
        if(filhos > 0){
            return filhos * 50;
        }
        return 0;
    }
    public double salarioLiq(){
        double salarioliq;
        // CALCULO
        return salarioliq = (salario - inss() + bonusGerente() + bonusVendedor() - descontovaleTransporte() + bonusTrabalhoNoturno() + bonusFilho());
        
    }

}
