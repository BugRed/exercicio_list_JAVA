package list03.exercicios;

import java.util.Scanner;

/**
     Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar,
     e se é positivo ou negativo. O programa só deve parar de rodar quando o usuário responder "S" na seguinte
     pergunta, "Deseja encerrar o programa?" .
 */

public class Exercicio39 {

    public static void main(String[] args) {
        int number;
        char choise;

        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Digite um número para conferir:");
            number = sc.nextInt();

            if (number % 2 == 0){
                System.out.println("Esse número é Par!");
            } else {
                System.out.println("Esse número é impar!");
            }

            if (number > 0){
                System.out.println("Esse número é positivo!");
            } else {
                System.out.println("Esse número é negativo!");
            }

            System.out.println("Deseja continuar conferindo números? (s/n)");
            choise = sc.next().charAt(0);

        }while (Character.toLowerCase(choise) == 's');

        sc.close();
        System.out.println("Fim do programa!");
    }

}
