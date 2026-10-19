// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 7:

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maioresDe50 = 0;
        double somaAlturas10a20 = 0;
        int quantidade10a20 = 0;
        int pesoMenorQue40 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + " - Digite a idade: ");
            int idade = entrada.nextInt();

            System.out.println("Pessoa " + i + " - Digite a altura (em metros): ");
            double altura = entrada.nextDouble();

            System.out.println("Pessoa " + i + " - Digite o peso (em kg): ");
            double peso = entrada.nextDouble();

            if (idade > 50) {
                maioresDe50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas10a20 += altura;
                quantidade10a20++;
            }

            if (peso < 40) {
                pesoMenorQue40++;
            }
        }

        System.out.println("Pessoas maiores de 50 anos: " + maioresDe50);

        if (quantidade10a20 > 0) {
            System.out.println("Media das alturas (10 a 20 anos): " + (somaAlturas10a20 / quantidade10a20));
        } else {
            System.out.println("Nenhuma pessoa com idade entre 10 e 20 anos foi informada.");
        }

        double porcentagem = pesoMenorQue40 * 100.0 / 10;
        System.out.println("Porcentagem de pessoas com peso inferior a 40 kg: " + porcentagem + "%");

        entrada.close();
    }
}
