package lista02.exercicios;

import java.util.Scanner;

public class DiferencaEntreNumeros {
    /*
        Escreva um programa que leia dois números e apresente a diferença do maior para o menor.
     */

    public static void main(String[] args){

        int a, b, difference;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        a = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        b = sc.nextInt();

        // Cadeia de decisão para saber se os números são maiores, menores ou iguais
        if (a == b){
            System.out.printf("A diferença entre %d e %d é de %d", b, a, 0);
        } else if (a < b){
            difference = b - a;
            System.out.printf("A diferença entre %d e %d é de %d", b, a, difference);
        } else {
            difference = a - b;
            System.out.printf("A diferença entre %d e %d é de %d", a, b, difference);
        }

        sc.close();
    }
}
