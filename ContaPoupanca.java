public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(double saldoInicial){
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException{
        if(saldo - valor < 50){
            throw new SaldoInsuficienteException("Saque não permitido: Saldo mínimo de R$ 50,00 é necessário!");

        }
        saldo-= valor; //saldo = saldo - valor

        System.out.println("Saque no valor de: " + valor + " realizado com sucesso.");
    }
}