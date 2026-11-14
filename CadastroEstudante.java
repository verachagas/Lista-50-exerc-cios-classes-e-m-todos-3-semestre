package flamingo.aprendendo.basico.listapoo.dominio;

public class CadastroEstudante {
    public void cadastrar(Estudante estudante, String nome, int idade, String sexo) {
        estudante.nome = nome;
        estudante.idade = idade;
        estudante.sexo = sexo;
    }
}
