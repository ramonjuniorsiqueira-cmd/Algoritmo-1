// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 4:

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o plano de trabalho (A, B ou C): ");
        char plano = entrada.next().charAt(0);

        System.out.println("Digite o salario atual: ");
        double salario = entrada.nextDouble();

        double novoSalario;

        switch (plano) {
            case 'A':
            case 'a':
                novoSalario = salario * 1.10;
                System.out.println("Novo salario: " + novoSalario);
                break;
            case 'B':
            case 'b':
                novoSalario = salario * 1.15;
                System.out.println("Novo salario: " + novoSalario);
                break;
            case 'C':
            case 'c':
                novoSalario = salario * 1.20;
                System.out.println("Novo salario: " + novoSalario);
                break;
            default:
                System.out.println("Plano invalido");
            entrada.close();
        }
    }
}
