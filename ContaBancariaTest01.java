package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.Banco;
import flamingo.aprendendo.basico.listapoo.dominio.ContaBancaria;

public class ContaBancariaTest01 {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Carlos Silva";
        conta.numeroConta = "12345-6";
        conta.saldo = 1500.75;

        System.out.println("--- EX 17: SALDO POSITIVO ---");
        System.out.println("Titular: " + conta.titular + " | Tem saldo? " + conta.temSaldo());


        System.out.println("\n--- EX 26: VERIFICAR SAQUE ---");
        System.out.println("Pode sacar R$ 500? " + conta.podeSacar(500));
        System.out.println("Pode sacar R$ 3000? " + conta.podeSacar(3000));


        System.out.println("\n--- EX 36 e 37: DEPOSITAR E SACAR ---");
        System.out.println("Saldo antes: R$ " + conta.saldo);
        conta.depositar(500.0);
        System.out.println("Saldo após depósito de R$ 500: R$ " + conta.saldo);
        conta.sacar(400.0);
        System.out.println("Saldo após saque de R$ 400: R$ " + conta.saldo);
        conta.sacar(5000.0);


        System.out.println("\n--- EX 46: TRANSFERÊNCIA BANCÁRIA ---");
        ContaBancaria contaDestino = new ContaBancaria();
        contaDestino.titular = "Mariana Costa";
        contaDestino.numeroConta = "98765-4";
        contaDestino.saldo = 200.0;

        Banco banco = new Banco();
        banco.transferir(conta, contaDestino, 600.0);

        System.out.println("Saldo " + conta.titular + ": R$ " + conta.saldo);
        System.out.println("Saldo " + contaDestino.titular + ": R$ " + contaDestino.saldo);
    }
}
