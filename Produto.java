package flamingo.aprendendo.basico.listapoo.dominio;

public class Produto {
     public String nome;
     public double preco;
     public int quantidade;

     public double calcularValorTotal() {
          return preco * quantidade;
     }

     public String verificarCategoria() {
          if (preco >= 1000) {
               return "Produto caro";
          } else {
               return "Produto barato";
          }
     }


     public double aplicarDesconto(double porcentagem) {
          return preco - (preco * (porcentagem / 100.0));
     }


     public double aumentarPreco(double porcentagem) {
          return preco + (preco * (porcentagem / 100.0));
     }


     public double calcularFrete(double taxaFrete) {
          return preco + taxaFrete;
     }


     public boolean estoqueBaixo(int quantidadeMinima) {
          return quantidade < quantidadeMinima;
     }
}