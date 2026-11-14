package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.CadastroEstudante;
import flamingo.aprendendo.basico.listapoo.dominio.Estudante;
import flamingo.aprendendo.basico.listapoo.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "Natalia";
        estudante.idade = 27;
        estudante.sexo = "Feminino";

        System.out.println("--- DADOS ORIGINAIS ---");
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);

        // --- EXERCÍCIO 31: ImpressoraEstudante ---
        Estudante estudante2 = new Estudante();
        estudante2.nome = "Lucas";
        estudante2.idade = 24;
        estudante2.sexo = "Masculino";

        ImpressoraEstudante impressora = new ImpressoraEstudante();
        System.out.println("\n--- EX 31: IMPRESSORA ESTUDANTE ---");
        impressora.imprime(estudante);
        impressora.imprime(estudante2);

        // --- EXERCÍCIO 41: CadastroEstudante ---
        Estudante estudante3 = new Estudante();
        Estudante estudante4 = new Estudante();

        CadastroEstudante cadastro = new CadastroEstudante();
        cadastro.cadastrar(estudante3, "Mariana Costa", 21, "Feminino");
        cadastro.cadastrar(estudante4, "Pedro Santos", 20, "Masculino");

        System.out.println("--- EX 41: CADASTRO E IMPRESSÃO ---");
        impressora.imprime(estudante3);
        impressora.imprime(estudante4);
    }
}
