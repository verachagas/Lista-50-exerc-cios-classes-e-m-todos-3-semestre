package flamingo.aprendendo.basico.listapoo.dominio;

public class ImpressoraProduto {
    public void imprime(Produto produto) {
        System.out.println("Nome: " + produto.nome);
        System.out.println("Preço: R$ " + produto.preco);
        System.out.println("Quantidade: " + produto.quantidade);
        System.out.println("Valor Total: R$ " + produto.calcularValorTotal());
        System.out.println("--------------------");
    }
}