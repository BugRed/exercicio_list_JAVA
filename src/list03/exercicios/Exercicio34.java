package list03.exercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio34 {
    /*
        Escreva um programa que leia um conjunto de números positivos e exiba o menor e o maior. Suporemos que o
        número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o fim
        dos dados.
    */

    public static void main(String[] args) {
        int x = 1;


        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> vetor = new ArrayList<>();

        do {
            System.out.println("Escreva um número positivo qualquer ou digite um número negativo para sair: ");
            x = sc.nextInt();

            // Se o número digitado for maior que zero ele adiciona na lista
            // Se não ele sai do while
            if (x > 0){
                vetor.add(x);
            }
        }while(x > 0);

        // Usando STREAM para ordenar os valores de dentro do array;
        ArrayList<Integer> vetorOrder = vetor.stream().sorted().collect(Collectors.toCollection(ArrayList::new));


        // Exibindo o maior e o menor
        System.out.println("O menor número é o " + vetorOrder.getFirst() + " e o maior é o " + vetorOrder.getLast());

    }
}
