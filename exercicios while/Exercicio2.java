// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 2:

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int pares = 0;
        int impares = 0;

        while (contador <= 10) {
            System.out.println("Digite o " + contador + "o numero: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            contador++;
        }

        System.out.println("O total de pares e: " + pares);
        System.out.println("O total de impares e: " + impares);

        entrada.close();
    }
}
