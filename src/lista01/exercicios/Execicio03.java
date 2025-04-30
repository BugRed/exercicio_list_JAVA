package lista01.exercicios;

import java.util.Scanner;

public class Execicio03 {
//Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
//comissão será de 5% do total da venda e que você tem os seguintes dados:
//    - Identificação do vendedor
//    - Código da peça
//    - Preço unitário da peça
//    - Quantidade vendida

    public static void main(String[] args) {

        int totalVendas, vendedorID;
        double precoUnitario;

        final double comissao = 0.05;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o identificador do vendedor: ");
        vendedorID = sc.nextInt();

        System.out.println("Digite quantas vendas esse vendedor fez: ");
        totalVendas = sc.nextInt();

        System.out.println("Digite o preço unitário de cada peça vendida: ");
        precoUnitario = sc.nextDouble();

        //deixando o calculo direto no sout
        System.out.println("A comissão do vendedor Nº: " + vendedorID + " é de: " + (totalVendas * precoUnitario * comissao));


        sc.close();
    }
}
