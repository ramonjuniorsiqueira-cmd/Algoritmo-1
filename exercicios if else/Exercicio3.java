// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 3:

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro: ");
        int a = entrada.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        int b = entrada.nextInt();

        if (a == b) {
            System.out.println("Numeros iguais");
        } else if (a > b) {
            System.out.println("Diferenca: " + (a - b));
        } else {
            System.out.println("Diferenca: " + (b - a));
        }

        entrada.close();
    }
}
