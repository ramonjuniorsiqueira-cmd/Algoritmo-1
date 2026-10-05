// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 5:

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = entrada.nextInt();

        if (numero >= 50 && numero <= 100) {
            System.out.println("Pertence ao intervalo");
        } else {
            System.out.println("Nao pertence ao intervalo");
        }

        entrada.close();
    }
}
