package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.Produto;
import flamingo.aprendendo.basico.listapoo.dominio.Promocao;

public class PromocaoTest01 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Notebook";
        produto.preco = 2360.99;

        System.out.println("Preço antes: R$ " + produto.preco);

        Promocao promocao = new Promocao();
        promocao.aplicarDesconto(produto, 10);

        System.out.println("Preço depois: R$ " + produto.preco);
    }
}