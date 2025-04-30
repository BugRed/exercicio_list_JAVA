package list03.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio32 {

    /*
        Escreva um programa que calcule e exiba:
        a soma dos quadrados dos 20 primeiros números inteiros positivos e ímpares;
        a partir do número informado pelo usuário: menor que 10 e maior que zero.
    */

    public static void main(String[] args) {
        // Pegar um número com o usuário;
        // esse número precisa estar entre 9 e 1;
        // Pegar os 20 proximos numeros inteiros, positivos e impares;
        // separar os números inteiros, positivos e impares;
        // Elevar todos ao quadrado;
        // Somar todos os números;


        int option = 1, sum = 0, n;
        int[] vetor = new int[20];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número qualquer entre 1 e 9: ");
        option = sc.nextInt();

        // capturando apenas números entre 1 e 9
        while(option > 9 || option < 1){
            System.out.println("Por favor, digite um número qualquer entre 1 e 9: ");
            option = sc.nextInt();
        }

        // Guardando o valor antes dele mudar;
        n = option;

        // teste para saber se o número enviado é par ou impar
        if (option %2 == 0){
            //Se par, soma +1 e adiciona na primeira posição do vetor
            vetor[0] = ++option;
            // Itera pelo vetor colocando em cada posição o número anterior +2 garantindo serem impares
            for (int i = 1; i < vetor.length; i++){
                option += 2;
                vetor[i] = option;
            }
        }else{
            // Se impar, coloca ele mesmo no inicio do vetor
            vetor[0] = option;
            // Itera pelo vetor colocando em cada posição o número anterior +2 garantindo serem impares
            for (int i = 0; i < vetor.length; i++){
                option += 2;
                vetor[i] = option;
            }
        }

        System.out.printf("Esses são os 20 primeiros números impares depois de %d.\n\n", n);
        System.out.println(Arrays.toString(vetor));

        // alterando o vetor para que ele multiplique cada número por ele mesmo;
        for (int i = 0; i < vetor.length; i++){
            vetor[i] *= vetor[i];
        }

        System.out.printf("Esses são os quadrados dos 20 primeiros números impares depois de %d.\n\n", n);
        System.out.println(Arrays.toString(vetor));

        // Domando todos os números do vetor;
        for (int x : vetor) {
            sum += x;
        }

        System.out.printf("A soma de todos os 20 primeiros números inteiros, positivos, " +
                "impares depois de %d elevados ao quadrado é: %d. \n\n", n, sum);





    }
}
