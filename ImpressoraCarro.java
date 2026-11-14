package flamingo.aprendendo.basico.listapoo.dominio;

public class ImpressoraCarro {
    public void imprime(Carro carro) {
        System.out.println("Nome: " + carro.nome);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Velocidade Atual: " + carro.velocidadeAtual + " km/h");
        System.out.println("--------------------");
    }

    public void imprimir(Carro carro, int limiteDaVia) {
        System.out.println("Nome: " + carro.nome);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Velocidade Atual: " + carro.velocidadeAtual + " km/h");
        System.out.println("Status na Via: " + carro.gerarMensagemMulta(limiteDaVia));
        System.out.println("--------------------");
    }

}