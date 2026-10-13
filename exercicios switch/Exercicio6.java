// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 6:

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o codigo do produto: ");
        int codigo = entrada.nextInt();

        System.out.println("Digite a quantidade: ");
        int quantidade = entrada.nextInt();

        String produto = "";
        double preco = 0;
        boolean valido = true;

        switch (codigo) {
            case 100:
                produto = "Cachorro Quente";
                preco = 1.20;
                break;
            case 101:
                produto = "Bauru Simples";
                preco = 1.30;
                break;
            case 102:
                produto = "Bauru com ovo";
                preco = 1.50;
                break;
            case 103:
                produto = "Hamburguer";
                preco = 1.20;
                break;
            case 104:
                produto = "Cheeseburguer";
                preco = 1.30;
                break;
            case 105:
                produto = "Refrigerante";
                preco = 1.00;
                break;
            default:
                valido = false;
                System.out.println("Codigo de produto invalido");
        }

        if (valido) {
            double total = preco * quantidade;
            System.out.println("Produto: " + produto);
            System.out.println("Valor a pagar: R$ " + total);
           
            entrada.close();
        }
    }
}
