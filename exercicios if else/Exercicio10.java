// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 10:

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int a = entrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        int b = entrada.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int c = entrada.nextInt();

        if (a == b && b == c) {
            System.out.println("os numeros sao iguais");
        } else {
            int maior = a;
            if (b > maior) {
                maior = b;
            }
            if (c > maior) {
                maior = c;
            }
            System.out.println("O maior numero e: " + maior);
        }

        entrada.close();
    }
}
