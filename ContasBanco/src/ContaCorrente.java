public class ContaCorrente implements Conta {
    private double saldo;
    private double limite;

    public ContaCorrente(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public ContaCorrente(Cliente venilton) {

    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void transferir(double valor, ContaPoupanca poupanca) {
        throw new UnsupportedOperationException("Unimplemented method 'transferir'");
    }

    @Override
    public void imprimirExtrato() {
        throw new UnsupportedOperationException("Unimplemented method 'imprimirExtrato'");
    }
}
