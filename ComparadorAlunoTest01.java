package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.Aluno;
import flamingo.aprendendo.basico.listapoo.dominio.ComparadorAluno;

public class ComparadorAlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        aluno01.nome = "Mariana Costa";
        aluno01.nota1 = 8.5;
        aluno01.nota2 = 9.0;

        Aluno aluno02 = new Aluno();
        aluno02.nome = "Lucas Silva";
        aluno02.nota1 = 6.0;
        aluno02.nota2 = 7.5;

        ComparadorAluno comparador = new ComparadorAluno();
        Aluno maiorMedia = comparador.retornarAlunoComMaiorMedia(aluno01, aluno02);

        System.out.println("Aluno com maior média: " + maiorMedia.nome);
    }
}
