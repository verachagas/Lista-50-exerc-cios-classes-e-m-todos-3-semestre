package flamingo.aprendendo.basico.listapoo.dominio;

public class Banco {
    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        if (origem.podeSacar(valor)) {
            origem.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}