package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.ComparadorProduto;
import flamingo.aprendendo.basico.listapoo.dominio.Produto;

public class ComparadorProdutoTest01 {
    public static void main(String[] args) {
        Produto produto01 = new Produto();
        produto01.nome = "Notebook";
        produto01.preco = 2360.99;

        Produto produto02 = new Produto();
        produto02.nome = "Mouse Gamer";
        produto02.preco = 150.00;

        ComparadorProduto comparador = new ComparadorProduto();
        Produto maisCaro = comparador.retornarProdutoMaisCaro(produto01, produto02);

        System.out.println("Produto mais caro: " + maisCaro.nome);
    }
}