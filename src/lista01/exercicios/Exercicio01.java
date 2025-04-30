package lista01.exercicios;

import java.util.Scanner;

public class Exercicio01 {

    /*
    Faça um programa para calcular o estoque médio de uma peça, sendo que:
    ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
    */
    public static void main(String[] args){

        int qtdMinima, qtdMaxima, estoqueMedio;
        Scanner sc = new Scanner(System.in);

        //pega as informações do teclado
        System.out.println("Digite a quantidade de material comprado:");
        qtdMaxima = sc.nextInt();
        System.out.println("Digite a quantidade minima que pode haver no estoque:");
        qtdMinima = sc.nextInt();

        //calculo de estoque
        estoqueMedio = (qtdMinima + qtdMaxima) / 2;

        System.out.println("O estoque medio dessa mercadoria é igual a: " + estoqueMedio);

    }
}

