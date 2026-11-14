package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.Animal;


public class AnimalTest01 {
    public static void main(String[] args) {
        Animal animal01 = new Animal();
        animal01.nome = "Rex";
        animal01.especie = "Cachorro";
        animal01.idade = 5;

        Animal animal02 = new Animal();
        animal02.nome = "Mingau";
        animal02.especie = "Gato";
        animal02.idade = 3;

        System.out.println("--- ANIMAL 1 ---");
        System.out.println("Nome: " + animal01.nome);
        System.out.println("Espécie: " + animal01.especie);
        System.out.println("Idade: " + animal01.idade + " anos");

        System.out.println();

        System.out.println("--- ANIMAL 2 ---");
        System.out.println("Nome: " + animal02.nome);
        System.out.println("Espécie: " + animal02.especie);
        System.out.println("Idade: " + animal02.idade + " anos");
    }
}
