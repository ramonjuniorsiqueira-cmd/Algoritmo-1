// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 5:

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double a = entrada.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double b = entrada.nextDouble();

        System.out.println("Escolha a operacao (M - Media, S - Diferenca, P - Produto, D - Divisao): ");
        char opcao = entrada.next().charAt(0);

        switch (opcao) {
            case 'M':
            case 'm':
                System.out.println("Media: " + ((a + b) / 2));
                break;
            case 'S':
            case 's':
                if (a > b) {
                    System.out.println("Diferenca: " + (a - b));
                } else {
                    System.out.println("Diferenca: " + (b - a));
                }
                break;
            case 'P':
            case 'p':
                System.out.println("Produto: " + (a * b));
                break;
            case 'D':
            case 'd':
                if (b != 0) {
                    System.out.println("Divisao: " + (a / b));
                } else {
                    System.out.println("Impossivel dividir por zero!");
                }
                break;
            default:
                System.out.println("Opcao invalida");
       
            entrada.close();
        }  
    }
}
