// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 3:

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o periodo (M - Matutino, V - Vespertino, N - Noturno): ");
        char periodo = entrada.next().charAt(0);

        switch (periodo) {
            case 'M':
            case 'm':

                System.out.println("bom dia");
                break;
            case 'V':
            case 'v':

                System.out.println("boa tarde");
                break;
            case 'N':
            case 'n':

                System.out.println("boa noite");
                break;

            default:
                System.out.println("Periodo invalido");
       

            entrada.close();
        }
    }
}
