// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 4:

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double a = entrada.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double b = entrada.nextDouble();

        if (a > b) {
            System.out.println(a + ", " + b);
        } else {
            System.out.println(b + ", " + a);
        }

        entrada.close();
    }
}
