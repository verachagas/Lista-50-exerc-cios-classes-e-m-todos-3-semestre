package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.CadastroCarro;
import flamingo.aprendendo.basico.listapoo.dominio.Carro;
import flamingo.aprendendo.basico.listapoo.dominio.ImpressoraCarro;
import flamingo.aprendendo.basico.listapoo.dominio.Oficina;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro01 = new Carro();
        carro01.nome = "Hyundai";
        carro01.modelo = "Hb20";
        carro01.ano = 2015;
        carro01.velocidadeAtual = 95;

        Carro carro02 = new Carro();
        carro02.nome = "Fiat";
        carro02.modelo = "Toro";
        carro02.ano = 2025;
        carro02.velocidadeAtual = 60;

        System.out.println("--- EX 16: IDADE DO CARRO ---");
        System.out.println(carro01.modelo + ": " + carro01.verificarIdadeDoCarro());
        System.out.println(carro02.modelo + ": " + carro02.verificarIdadeDoCarro());


        System.out.println("\n--- EX 23, 24 e 35: MULTAS (Limite 80 km/h) ---");
        System.out.println("Ex 23 - Hb20 multado? " + carro01.isMultado(80));
        System.out.println("Ex 24 - Mensagem Hb20: " + carro01.gerarMensagemMulta(80));
        System.out.print("Ex 35 - Hb20: ");
        carro01.imprimirMulta(80);
        System.out.print("Ex 35 - Toro: ");
        carro02.imprimirMulta(80);


        System.out.println("\n--- EX 38 e 39: ACELERAR E FREAR ---");
        System.out.println("Velocidade Toro antes: " + carro02.velocidadeAtual);
        carro02.acelerar(30);
        System.out.println("Velocidade Toro após acelerar 30: " + carro02.velocidadeAtual);
        carro02.frear(150);
        System.out.println("Velocidade Toro após frear 150: " + carro02.velocidadeAtual);


        System.out.println("\n--- EX 32: IMPRESSORA CARRO ---");
        ImpressoraCarro impressora = new ImpressoraCarro();
        impressora.imprime(carro01);


        System.out.println("--- EX 47: OFICINA (TROCAR VELOCIDADES) ---");
        carro02.velocidadeAtual = 50;
        System.out.println("Antes -> Hb20: " + carro01.velocidadeAtual + " | Toro: " + carro02.velocidadeAtual);
        Oficina oficina = new Oficina();
        oficina.trocarVelocidades(carro01, carro02);
        System.out.println("Depois -> Hb20: " + carro01.velocidadeAtual + " | Toro: " + carro02.velocidadeAtual);


        System.out.println("\n--- EX 42 e 50: CADASTRO E SISTEMA COMPLETO ---");
        Carro carro03 = new Carro();
        CadastroCarro cadastro = new CadastroCarro();
        cadastro.cadastrar(carro03, "Honda", "Civic", 2022, 110);
        impressora.imprimir(carro03, 80);
    }
}


