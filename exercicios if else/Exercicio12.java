// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 12:

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salario: ");
        double salario = entrada.nextDouble();

        double desconto;

        if (salario <= 600.00) {
            desconto = 0;
            System.out.println("Isento de desconto");
        } else if (salario <= 1200.00) {
            desconto = salario * 0.20;
            System.out.println("Desconto do INSS: " + desconto);
        } else if (salario <= 2000.00) {
            desconto = salario * 0.25;
            System.out.println("Desconto do INSS: " + desconto);
        } else {
            desconto = salario * 0.30;
            System.out.println("Desconto do INSS: " + desconto);
        }

        entrada.close();
    }
}
