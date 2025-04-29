package list03.exercicios;

import java.util.Scanner;

public class NegativosPositivosParImpar {
    /*
        Escrever um programa que leia um conjunto de números positivos, e exiba se o número lido é par ou ímpar. Exiba
        ao final a soma total dos números pares lidos e também a soma dos números ímpares lidos. Suporemos que o
        número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o
        fim dos dados.
     */

    public static void main(String[] args) {
        int x = 1, oddSum = 0, evenSum = 0;

        Scanner sc = new Scanner(System.in);

        while(x > 0){
            System.out.println("Escreva um número positivo qualquer ou digite um número negativo para sair: ");
            x = sc.nextInt();

            if ( x > 0 && x % 2 == 0){
                System.out.println("Esse número é par!");
                evenSum += x;
            } else if(x > 0){
                System.out.println("Esse número é impar!");
                oddSum += x;
            }
        }
        System.out.println("A soma dos números pares é: " + evenSum);
        System.out.println("A soma dos número impares é: " + oddSum);
    }
}
