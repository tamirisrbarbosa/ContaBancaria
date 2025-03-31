public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldoInicial){
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException{
        if(valor > saldo){
            throw new SaldoInsuficienteException("Saque não permitido: saldo insuficiente.");
        }
        saldo -= valor;
        System.out.println("Saque no valor de: " + valor + " realizado com sucesso.");
        }
        
    }