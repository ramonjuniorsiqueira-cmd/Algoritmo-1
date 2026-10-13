// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 6:

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int menor = Integer.MAX_VALUE;

        while (contador <= 10) {
            int numero;

            // valida que o numero seja positivo
            do {
                System.out.println("Digite o " + contador + "o numero (positivo): ");
                numero = entrada.nextInt();
            } while (numero <= 0);

            if (numero < menor) {
                menor = numero;
            }

            contador++;
        }

        System.out.println("O menor numero e: " + menor);
        entrada.close();
    }
}
