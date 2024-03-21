package banco;

public class ContaBancaria {
    private Cliente correntista;
    protected double saldo;
    private String numeroConta;
    private Banco banco;

    public ContaBancaria(){

    }
    public ContaBancaria(String numeroConta){ // construtor
        this.numeroConta = numeroConta;
        saldo = 0;
    }
    public void sacar(double valor){ // esse método serve para sacar o valor que esta no saldo
        if (valor >=0 && valor <= saldo){
            this.saldo -= valor;
        }
    }
    public void depositar(double valor){ // esse método serve para adicionar o valor no saldo
        if (valor >= 0){
            this.saldo += valor;
        }
    }

    // -------

    public double getSaldo() {
        return saldo;
    }

    // NumeroConta
    public void setNumeroConta(String NumeroConta){
        this.numeroConta = numeroConta;
    }
    public String getNumeroConta(){
        return numeroConta;
    }

    // correntista
    public void setCorrentista(Cliente correntista){
        this.correntista = correntista;
    }
    public Cliente getCorrentista() {
        return correntista;
    }

    // banco
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    public Banco getBanco() {
        return banco;
    }
}
