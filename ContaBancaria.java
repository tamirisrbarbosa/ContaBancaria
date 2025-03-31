abstract class ContaBancaria{
    protected double saldo;

    public ContaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }
    
    public abstract void sacar(double valor) throws SaldoInsuficienteException;

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito de R$" + valor + "realizado com sucesso");
        }
    }