package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.CadastroEstudante;
import flamingo.aprendendo.basico.listapoo.dominio.Estudante;
import flamingo.aprendendo.basico.listapoo.dominio.ImpressoraEstudante;

public class CadastroEstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        CadastroEstudante cadastro = new CadastroEstudante();
        cadastro.cadastrar(estudante1, "Mariana Costa", 21, "Feminino");
        cadastro.cadastrar(estudante2, "Pedro Santos", 20, "Masculino");

        ImpressoraEstudante impressora = new ImpressoraEstudante();
        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
    }
}
