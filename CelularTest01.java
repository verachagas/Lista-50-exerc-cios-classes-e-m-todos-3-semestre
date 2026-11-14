package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.Celular;

public class CelularTest01 {
    public static void main(String[] args) {
        Celular celular01 = new Celular();
        celular01.marca = "Apple";
        celular01.modelo = "iPhone 15 Pro";
        celular01.preco = 7500.00;

        Celular celular02 = new Celular();
        celular02.marca = "Samsung";
        celular02.modelo = "Galaxy A55";
        celular02.preco = 1850.00;

        System.out.println("--- CELULAR 1 ---");
        System.out.println("Marca: " + celular01.marca);
        System.out.println("Modelo: " + celular01.modelo);
        System.out.println("Preço: R$ " + celular01.preco);
        if (celular01.isPremium()) {
            System.out.println("Categoria: Este celular é premium.");
        } else {
            System.out.println("Categoria: Este celular não é premium.");
        }

        System.out.println("\n--- CELULAR 2 ---");
        System.out.println("Marca: " + celular02.marca);
        System.out.println("Modelo: " + celular02.modelo);
        System.out.println("Preço: R$ " + celular02.preco);
        if (celular02.isPremium()) {
            System.out.println("Categoria: Este celular é premium.");
        } else {
            System.out.println("Categoria: Este celular não é premium.");
        }
    }
}

