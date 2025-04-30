package list03.exercicios;

import java.util.Scanner;

public class Exercicio27 {
    /*
        Escreva um programa que leia:
        - a quantidade de números que deverá processar;
        - os números que deverá processar,e calcule e exiba, para cada número a ser processado o seu fatorial. Lembrete:
        O fatorial de um número N é dado pela fórmula: N! = 1 * 2 * 3 * 4 * 5 * ... * N
    */

    public static void Factorial(int[] list){

        // Iniciando fact com o número neutro da multiplicação
        double fact = 1;
        for (int i = 0; i < list.length; i++){
            for (int j = 1; j < list[i] + 1; j++){
                // Fatorando com base no número que foi informado dentro da lista
                fact *= j;
            }
            // Mostrando o fatorial de cada número
            System.out.printf("O fatorial de %d é %.2f\n", list[i], fact);
            // Reiniciando o número neutro da multiplicação
            fact = 1;
        }
    }

    public static void main(String[] args) {
        int option;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o quantidade de números que deseja fatorar: ");
        option = sc.nextInt();

        // Inicando a lista com o tamanho solicitado
        int[] list = new int[option];

        // Preenchendo a lista
        for (int i = 0; i < list.length ; i++){
            System.out.printf("Digite o %dº número\n", (i+1));
            list[i] = sc.nextInt();
        }

        // Chamando a Função Factorial
        Factorial(list);

    }
}
