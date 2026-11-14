package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.Livro;

public class LivroTest01 {
    public static void main(String[] args) {

        Livro livro01 = new Livro();
        livro01.titulo = "O Alquimista";
        livro01.autor = "Paulo Coelho";
        livro01.numeroPaginas = 208;
        livro01.preco = 45.90;

        Livro livro02 = new Livro();
        livro02.titulo = "Dom Casmurro";
        livro02.autor = "Machado de Assis";
        livro02.numeroPaginas = 256;
        livro02.preco = 29.90;

        System.out.println("--- INFORMAÇÕES DO LIVRO 1 ---");
        System.out.println("Título: " + livro01.titulo);
        System.out.println("Autor: " + livro01.autor);
        System.out.println("Número de Páginas: " + livro01.numeroPaginas);
        System.out.println("Preço: R$ " + livro01.preco);
        System.out.println("Tamanho: " + livro01.verificarTamanho());

        System.out.println();

        System.out.println("--- INFORMAÇÕES DO LIVRO 2 ---");
        System.out.println("Título: " + livro02.titulo);
        System.out.println("Autor: " + livro02.autor);
        System.out.println("Número de Páginas: " + livro02.numeroPaginas);
        System.out.println("Preço: R$ " + livro02.preco);
        System.out.println("Tamanho: " + livro02.verificarTamanho());
    }
}