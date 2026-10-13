// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 7:

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int quantidadeNormal = 0;

        while (contador <= 10) {
            System.out.println("Pessoa " + contador + " - Digite a altura (em metros): ");
            double altura = entrada.nextDouble();

            System.out.println("Pessoa " + contador + " - Digite o peso (em kg): ");
            double peso = entrada.nextDouble();

            double imc = peso / (altura * altura);
            System.out.println("IMC da pessoa " + contador + ": " + imc);

            if (imc >= 18.5 && imc <= 24.9) {
                quantidadeNormal++;
            }

            contador++;
        }

        System.out.println("Pessoas com IMC entre 18,5 e 24,9: " + quantidadeNormal);
        entrada.close();
    }
}
