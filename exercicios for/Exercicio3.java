// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 3:
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();

        System.out.print("Sequencia: ");
        for (int i = 1; i <= numero; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        entrada.close();
    }
}
