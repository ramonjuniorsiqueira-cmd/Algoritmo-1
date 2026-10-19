// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 6:

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int nulos = 0;
        int brancos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Eleitor " + i + " - Digite o voto (1 a 4 = candidato, 5 = nulo, 6 = branco): ");
            int voto = entrada.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    nulos++;
                    break;
                case 6:
                    brancos++;
                    break;
                default:
                    System.out.println("Codigo de voto invalido (nao contabilizado)");
            }
        }

        System.out.println("Votos do candidato 1: " + candidato1);
        System.out.println("Votos do candidato 2: " + candidato2);
        System.out.println("Votos do candidato 3: " + candidato3);
        System.out.println("Votos do candidato 4: " + candidato4);
        System.out.println("Votos nulos: " + nulos);
        System.out.println("Votos em branco: " + brancos);

        double percentualNulos = nulos * 100.0 / 10;
        double percentualBrancos = brancos * 100.0 / 10;
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos em branco: " + percentualBrancos + "%");
        System.out.println("Percentual de brancos e nulos juntos: " + (percentualNulos + percentualBrancos) + "%");

        entrada.close();
    }
}
