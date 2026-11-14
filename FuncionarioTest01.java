package flamingo.aprendendo.basico.listapoo.test;

import flamingo.aprendendo.basico.listapoo.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Roberto Alves";
        funcionario.salario = 4000.0;

        System.out.println("Bônus de 15%: R$ " + funcionario.calcularBonus(15));
    }
}
