// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 1:

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = entrada.nextInt();

        if (numero > 20) {
            double metade = numero / 2.0;
            System.out.println("A metade do numero e: " + metade);
        }

        entrada.close();
    }
}
