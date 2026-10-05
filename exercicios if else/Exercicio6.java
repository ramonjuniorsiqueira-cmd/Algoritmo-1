// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 6:

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a altura (em metros): ");
        double altura = entrada.nextDouble();

        System.out.println("Digite o sexo (M/F): ");
        char sexo = entrada.next().charAt(0);

        if (sexo == 'M' || sexo == 'm') {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Peso ideal: " + pesoIdeal);
        } else if (sexo == 'F' || sexo == 'f') {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Peso ideal: " + pesoIdeal);
        } else {
            System.out.println("Sexo invalido");
        }

        entrada.close();
    }
}
