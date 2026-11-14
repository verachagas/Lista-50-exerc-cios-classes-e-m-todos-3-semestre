package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Ana Paula";
        pessoa.idade = 22;

        System.out.println(pessoa.nome + " é maior de idade? " + pessoa.isMaiorDeIdade(18));
    }
}
