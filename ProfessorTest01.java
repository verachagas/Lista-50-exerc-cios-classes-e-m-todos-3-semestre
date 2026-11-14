package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome= "Natalia";
        professor.idade=27;
        professor.disciplina = "Sociedade e Natureza";
        professor.salario = 5000.00;

        System.out.println("Professora: " + professor.nome);
        System.out.println("Idade: " + professor.idade);
        System.out.println("Disciplina: " + professor.disciplina);
        System.out.println("Salário: " + professor.salario);


    }
}
