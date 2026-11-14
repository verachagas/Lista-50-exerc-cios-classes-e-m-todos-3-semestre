package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.CadastroCarro;
import flamingo.aprendendo.basico.listapoo.dominio.Carro;
import flamingo.aprendendo.basico.listapoo.dominio.ImpressoraCarro;

public class CadastroCarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        CadastroCarro cadastro = new CadastroCarro();
        cadastro.cadastrar(carro01, "Hyundai", "Hb20", 2015, 70);
        cadastro.cadastrar(carro02, "Fiat", "Toro", 2025, 110);

        ImpressoraCarro impressora = new ImpressoraCarro();
        impressora.imprime(carro01);
        impressora.imprime(carro02);
    }
}
