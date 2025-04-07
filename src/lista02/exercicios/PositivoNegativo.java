package lista02.exercicios;

import java.util.Scanner;

public class PositivoNegativo {

    /*
    Faça um programa que leia um número inteiro e mostre uma mensagem na tela indicando se este número é positivo
    ou negativo. Pare a execução do programa quando o usuário requisitar.
     */

    public static void main(String[] args){
        int x;
        char option;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite um número qualquer: ");
            x = sc.nextInt();

            // Decidindo se é positivo ou negativo, considerando 0 positivo
            if(x >= 0){
                System.out.printf("O número %d é POSITIVO!\n", x);
            }else {
                System.out.printf("O número %d é NEGATIVO!\n", x);
            }

            // Opção de parar ou não
            System.out.println("Deseja continuar a verificação de números?(s/n)");
            // Pegando apenas o primeiro caracter que foi digitado no teclado
            option = sc.next().charAt(0);

            // Transformando em letra minuscula o que vem do teclado
        } while (Character.toLowerCase(option) != 'n');

        System.out.println("Fim do Programa!");

        sc.close();


    }
}
