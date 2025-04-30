package lista02.exercicios;

import java.util.Scanner;

public class Exercicio16 {
    /*
        Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do
        menor número. Se os dois números forem iguais, o programa deve exibir mensagem informando este fato.
    */

    public static void main(String[] args){
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o primeiro número: ");
        a = sc.nextInt();

        System.out.println("Escreva o segundo número: ");
        b = sc.nextInt();

        // Decisão para saber quem é maior ou menor
        if (a < b) {
            System.out.printf("O número menor é %d\n", a);
            System.out.printf("O número maior é %d\n", b);
        } else if (b < a){
            System.out.printf("O número menor é %d\n", b);
            System.out.printf("O número maior é %d\n", a);
        } else {
            System.out.printf("%d e %d são números iguais", a, b);
        }

        sc.close();
    }
}
