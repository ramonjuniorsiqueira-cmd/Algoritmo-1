// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 9:

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salario bruto: ");
        double salarioBruto = entrada.nextDouble();

        System.out.println("Digite o valor da prestacao: ");
        double prestacao = entrada.nextDouble();

        double limite = salarioBruto * 0.30;

        if (prestacao <= limite) {
            System.out.println("Emprestimo pode ser concedido!");
        } else {
            System.out.println("Emprestimo nao pode ser concedido!");
        }

        entrada.close();
    }
}
