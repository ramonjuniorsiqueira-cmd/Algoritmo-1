// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 4:

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double somaAlturas = 0;
        int quantidade = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + " - Digite a idade: ");
            int idade = entrada.nextInt();

            System.out.println("Pessoa " + i + " - Digite a altura (em metros): ");
            double altura = entrada.nextDouble();

            if (idade > 50) {
                somaAlturas += altura;
                quantidade++;
            }
        }

        if (quantidade > 0) {
            double media = somaAlturas / quantidade;
            System.out.println("Media das alturas das pessoas com mais de 50 anos: " + media);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi informada.");
        }

        entrada.close();
    }
}
