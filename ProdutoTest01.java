package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.CadastroProduto;
import flamingo.aprendendo.basico.listapoo.dominio.ComparadorProduto;
import flamingo.aprendendo.basico.listapoo.dominio.ImpressoraProduto;
import flamingo.aprendendo.basico.listapoo.dominio.Produto;
import flamingo.aprendendo.basico.listapoo.dominio.Promocao;

public class ProdutoTest01 {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.nome = "Notebook";
        produto.preco = 2360.99;
        produto.quantidade = 3;

        Produto produto2 = new Produto();
        produto2.nome = "Mouse Gamer";
        produto2.preco = 150.00;
        produto2.quantidade = 10;

        System.out.println("--- EX 14 e 15: ESTOQUE E CATEGORIA ---");
        System.out.println("Valor total Notebook: R$ " + produto.calcularValorTotal());
        System.out.println(produto.nome + " -> " + produto.verificarCategoria());
        System.out.println(produto2.nome + " -> " + produto2.verificarCategoria());


        System.out.println("\n--- EX 21, 22, 27 e 30: CÁLCULOS E ESTOQUE ---");
        System.out.println("Ex 21 - Com 10% desconto: R$ " + produto.aplicarDesconto(10));
        System.out.println("Ex 22 - Com 20% aumento: R$ " + produto.aumentarPreco(20));
        System.out.println("Ex 27 - Com frete de R$ 50: R$ " + produto.calcularFrete(50));
        System.out.println("Ex 30 - Estoque baixo (mínimo 5)? " + produto.estoqueBaixo(5));


        System.out.println("\n--- EX 33: IMPRESSORA PRODUTO ---");
        ImpressoraProduto impressora = new ImpressoraProduto();
        impressora.imprime(produto);
        impressora.imprime(produto2);


        System.out.println("--- EX 43: CADASTRO PRODUTO ---");
        Produto produto3 = new Produto();
        CadastroProduto cadastro = new CadastroProduto();
        cadastro.cadastrar(produto3, "Monitor 27", 1200.00, 4);
        impressora.imprime(produto3);


        System.out.println("--- EX 45: COMPARADOR PRODUTO ---");
        ComparadorProduto comparador = new ComparadorProduto();
        Produto maisCaro = comparador.retornarProdutoMaisCaro(produto, produto2);
        System.out.println("Produto mais caro: " + maisCaro.nome);


        System.out.println("\n--- EX 48: PROMOÇÃO POR REFERÊNCIA ---");
        System.out.println("Preço Monitor antes: R$ " + produto3.preco);
        Promocao promocao = new Promocao();
        promocao.aplicarDesconto(produto3, 15);
        System.out.println("Preço Monitor depois de 15% desconto: R$ " + produto3.preco);
    }
}
