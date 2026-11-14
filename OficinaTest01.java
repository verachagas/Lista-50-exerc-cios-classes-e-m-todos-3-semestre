package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.Carro;
import flamingo.aprendendo.basico.listapoo.dominio.Oficina;

public class OficinaTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.modelo = "Hb20";
        carro01.velocidadeAtual = 60;

        Carro carro02 = new Carro();
        carro02.modelo = "Toro";
        carro02.velocidadeAtual = 110;

        System.out.println("Antes -> Hb20: " + carro01.velocidadeAtual + " | Toro: " + carro02.velocidadeAtual);

        Oficina oficina = new Oficina();
        oficina.trocarVelocidades(carro01, carro02);

        System.out.println("Depois -> Hb20: " + carro01.velocidadeAtual + " | Toro: " + carro02.velocidadeAtual);
    }
}
