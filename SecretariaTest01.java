package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.Aluno;
import flamingo.aprendendo.basico.listapoo.dominio.Secretaria;

public class SecretariaTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Mariana Costa";
        aluno.nota1 = 4.5;
        aluno.nota2 = 5.0;

        System.out.println("Situação antes: " + aluno.getSituacao());

        Secretaria secretaria = new Secretaria();
        secretaria.atualizarAluno(aluno, 8.5, 9.0);

        System.out.println("Situação depois: " + aluno.getSituacao());
    }
}