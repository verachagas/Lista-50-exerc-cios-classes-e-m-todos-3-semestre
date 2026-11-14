package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.Termometro;

public class TermometroTest01 {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.temperaturaAtual = 38.5;

        System.out.println("Passou do limite (37.5)? " + termometro.passouDoLimite(37.5));
    }
}