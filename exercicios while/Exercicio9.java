// Nome: Ramon Junior Siqueira Marinho - RA: 12526215294
// Exercicio 9:

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int continuar = 1;
        double totalCompra = 0;

        while (continuar == 1) {
            System.out.println("Digite o codigo do produto (100 a 105): ");
            int codigo = entrada.nextInt();

            System.out.println("Digite a quantidade: ");
            int quantidade = entrada.nextInt();

            String produto = "";
            double preco = 0;
            boolean valido = true;

            switch (codigo) {
                case 100:
                    produto = "Cachorro quente";
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
                double valorProduto = preco * quantidade;
                totalCompra = totalCompra + valorProduto;
                System.out.println(produto + " x" + quantidade + " = R$ " + valorProduto);
            }

            System.out.println("Deseja continuar comprando? (1 - sim / 0 - nao): ");
            continuar = entrada.nextInt();
        }

        System.out.println("Valor total da compra: R$ " + totalCompra);
        entrada.close();
    }
}
