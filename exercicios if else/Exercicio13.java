// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 13:

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = entrada.nextDouble();

        System.out.println("Digite a operacao desejada (+, -, *, /): ");
        char operacao = entrada.next().charAt(0);

        if (operacao == '+') {
            System.out.println("Resultado: " + (num1 + num2));
        } else if (operacao == '-') {
            System.out.println("Resultado: " + (num1 - num2));
        } else if (operacao == '*') {
            System.out.println("Resultado: " + (num1 * num2));
        } else if (operacao == '/') {
            if (num2 > 0) {
                System.out.println("Resultado: " + (num1 / num2));
            } else {
                System.out.println("Impossivel dividir!!");
            }
        } else {
            System.out.println("Sinal Invalido");
        }

        entrada.close();
    }
}
