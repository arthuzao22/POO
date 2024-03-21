package banco;

public class ContaEspecial extends ContaBancaria {
    private double limite;
    public ContaEspecial(String numero, double limite){
        this.limite = limite;
        setNumeroConta(numero);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0) {
            saldo -= valor;
        }
    }

    public double getLimite() {
        return limite;
    }
}
