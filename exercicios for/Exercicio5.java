// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 5:

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;
        double somaMedias = 0;

        for (int aluno = 1; aluno <= 6; aluno++) {
            System.out.println("Aluno " + aluno + " - Digite a nota 1: ");
            double nota1 = entrada.nextDouble();

            System.out.println("Aluno " + aluno + " - Digite a nota 2: ");
            double nota2 = entrada.nextDouble();

            double media = (nota1 + nota2) / 2;
            somaMedias += media;
            System.out.println("Media do aluno " + aluno + ": " + media);

            if (media >= 7) {
                System.out.println("APROVADO");
                aprovados++;
            } else if (media > 3) {
                System.out.println("EXAME");
                exame++;
            } else {
                System.out.println("REPROVADO");
                reprovados++;
            }
        }

        System.out.println("Total de alunos aprovados: " + aprovados);
        System.out.println("Total de alunos de exame: " + exame);
        System.out.println("Total de alunos reprovados: " + reprovados);
        System.out.println("Media da classe: " + (somaMedias / 6));

        entrada.close();
    }
}
