package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.Filme;

public class FilmeTest01 {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.titulo = "Interestelar";
        filme.genero = "Ficção Científica";
        filme.duracaoMinutos = 169;
        filme.classificacaoIndicativa = "12 anos";

        System.out.println("--- DETALHES DO FILME ---");
        System.out.println("Título: " + filme.titulo);
        System.out.println("Gênero: " + filme.genero);
        System.out.println("Duração: " + filme.duracaoMinutos + " minutos");
        System.out.println("Classificação Indicativa: " + filme.classificacaoIndicativa);

        if (filme.isFilmeLongo()) {
            System.out.println("Resultado: O filme é longo.");
        } else {
            System.out.println("Resultado: O filme não é longo (filme curto).");
        }
    }
}