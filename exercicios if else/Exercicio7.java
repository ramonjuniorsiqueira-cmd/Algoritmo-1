// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 7:

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salario do funcionario: ");
        double salario = entrada.nextDouble();

        System.out.println("Digite os anos de empresa: ");
        int anos = entrada.nextInt();

        double bonus;
        if (anos >= 5) {
            bonus = salario * 0.20;
        } else {
            bonus = salario * 0.10;
        }

        System.out.println("Valor do bonus: " + bonus);

        entrada.close();
    }
}
