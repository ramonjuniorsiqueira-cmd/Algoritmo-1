// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 2:

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa: ");
        int idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }

        entrada.close();
    }
}
