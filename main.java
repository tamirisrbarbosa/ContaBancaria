class main{
    public static void main(String[] args){
        ContaBancaria cc = new ContaCorrente(1000);
        ContaBancaria cp = new ContaPoupanca(500);

        cc.depositar(500);

        try{
            cc.sacar(200);
            cc.sacar(1500);
        }
        catch(SaldoInsuficienteException erro){
            System.out.println(erro.getMessage());
        }

        cp.depositar(300);

        try{
            cp.sacar(700);
            cp.sacar(51);
        }
        catch(SaldoInsuficienteException erro){
            System.out.println(erro.getMessage());
        }
    }
}