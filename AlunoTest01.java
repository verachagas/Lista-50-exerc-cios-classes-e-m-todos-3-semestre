package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.Aluno;
import flamingo.aprendendo.basico.listapoo.dominio.ComparadorAluno;
import flamingo.aprendendo.basico.listapoo.dominio.Secretaria;

public class AlunoTest01 {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Mariana Costa";
        aluno1.nota1 = 8.5;
        aluno1.nota2 = 9.0;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Lucas Silva";
        aluno2.nota1 = 5.5;
        aluno2.nota2 = 6.5;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Pedro Santos";
        aluno3.nota1 = 3.0;
        aluno3.nota2 = 4.0;

        System.out.println("--- SITUAÇÃO DOS ALUNOS (EX 12 e 13) ---");
        System.out.println(aluno1.nome + " | Aprovado? " + aluno1.isAprovado() + " | Situação: " + aluno1.getSituacao());
        System.out.println(aluno2.nome + " | Aprovado? " + aluno2.isAprovado() + " | Situação: " + aluno2.getSituacao());
        System.out.println(aluno3.nome + " | Aprovado? " + aluno3.isAprovado() + " | Situação: " + aluno3.getSituacao());


        System.out.println("\n--- EX 34: IMPRIMIR SITUAÇÃO ---");
        System.out.print(aluno1.nome + ": ");
        aluno1.imprimirSituacao();

        System.out.println("\n--- EX 40: ATUALIZAR NOTAS ---");
        System.out.println("Média antiga de " + aluno3.nome + ": " + aluno3.calcularMedia());
        aluno3.atualizarNotas(7.5, 8.0);
        System.out.println("Nova média de " + aluno3.nome + ": " + aluno3.calcularMedia());


        System.out.println("\n--- EX 44: COMPARADOR DE ALUNO ---");
        ComparadorAluno comparador = new ComparadorAluno();
        Aluno melhorAluno = comparador.retornarAlunoComMaiorMedia(aluno1, aluno2);
        System.out.println("Aluno com maior média: " + melhorAluno.nome);


        System.out.println("\n--- EX 49: SECRETARIA ---");
        System.out.println("Situação de " + aluno2.nome + " antes: " + aluno2.getSituacao());
        Secretaria secretaria = new Secretaria();
        secretaria.atualizarAluno(aluno2, 8.0, 9.0);
        System.out.println("Situação de " + aluno2.nome + " depois: " + aluno2.getSituacao());
    }
}
