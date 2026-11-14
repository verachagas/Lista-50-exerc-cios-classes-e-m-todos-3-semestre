package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.Banco;
import flamingo.aprendendo.basico.listapoo.dominio.ContaBancaria;

public class BancoTest01 {
    public static void main(String[] args) {
        ContaBancaria origem = new ContaBancaria();
        origem.titular = "Carlos Silva";
        origem.saldo = 1500.75;

        ContaBancaria destino = new ContaBancaria();
        destino.titular = "Mariana Costa";
        destino.saldo = 300.00;

        Banco banco = new Banco();
        banco.transferir(origem, destino, 500.00);

        System.out.println("Saldo " + origem.titular + ": R$ " + origem.saldo);
        System.out.println("Saldo " + destino.titular + ": R$ " + destino.saldo);
    }
}
