public interface Conta {
    public void sacar(double valor);
    public void depositar(double valor);
    public void transferir(double valor, ContaPoupanca poupanca);
    public void imprimirExtrato();
    void transferir(double valor, Conta contaDestino);  
}
