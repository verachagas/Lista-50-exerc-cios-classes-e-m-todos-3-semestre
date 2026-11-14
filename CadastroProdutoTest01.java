package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.CadastroProduto;
import flamingo.aprendendo.basico.listapoo.dominio.ImpressoraProduto;
import flamingo.aprendendo.basico.listapoo.dominio.Produto;

public class CadastroProdutoTest01 {
    public static void main(String[] args) {
        Produto produto01 = new Produto();
        Produto produto02 = new Produto();

        CadastroProduto cadastro = new CadastroProduto();
        cadastro.cadastrar(produto01, "Notebook", 2360.99, 3);
        cadastro.cadastrar(produto02, "Teclado Mecânico", 350.00, 10);

        ImpressoraProduto impressora = new ImpressoraProduto();
        impressora.imprime(produto01);
        impressora.imprime(produto02);
    }
}
