package Banco;
public class Main {

    public static void main(String[] args) {

        ContaCorrente contaCorrente =
                new ContaCorrente("Matheus", 123, 1000.0, 1);

        ContaPoupanca contaPoupanca =
                new ContaPoupanca("João", 456, 500.0, 2);

        System.out.println("Saldo inicial da conta corrente: R$ "
                + contaCorrente.getSaldo());

        System.out.println("Saldo inicial da conta poupança: R$ "
                + contaPoupanca.getSaldo());

        contaCorrente.depositar(200.0);

        System.out.println("\nApós depósito:");
        System.out.println("Conta Corrente: R$ "
                + contaCorrente.getSaldo());

        contaCorrente.sacar(150.0);

        System.out.println("\nApós saque:");
        System.out.println("Conta Corrente: R$ "
                + contaCorrente.getSaldo());

        contaCorrente.transferir(contaPoupanca, 300.0);

        System.out.println("\nApós transferência:");

        System.out.println("Conta Corrente: R$ "
                + contaCorrente.getSaldo());

        System.out.println("Conta Poupança: R$ "
                + contaPoupanca.getSaldo());

    }

}