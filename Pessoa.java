package flamingo.aprendendo.basico.listapoo.dominio;

public class Pessoa {
    public String nome;
    public int idade;

    public boolean isMaiorDeIdade(int idadeMinima) {
        return idade >= idadeMinima;
    }
}