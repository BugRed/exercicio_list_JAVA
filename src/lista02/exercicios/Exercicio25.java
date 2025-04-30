package lista02.exercicios;

import java.util.Scanner;

/**
 * Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um programa que calcule seu peso ideal,
 * utilizando as seguintes fórmulas: (h = altura)
 * - Para homens: (72.7*h) - 58
 * - Para mulheres: (62.1 *h) - 44.7*/
public class Exercicio25 {
    public static void main(String[] args){
            int option = 1;
            Scanner sc = new Scanner(System.in);

            //menu para manter o programa ativo mesmo após a resolução de um ou mais ifs
            while (option != 0){
                double height, idealWeight;
                System.out.println("Digite a altura em metros: ");
                height = sc.nextDouble();

                System.out.println("Você é HOMEM(1) ou MULHER(2)? ");
                option = sc.nextInt();


                if (option == 1){
                    // (72.7*h) - 58
                    idealWeight = (72.7 * height) - 58;

                    System.out.println("Seu peso ideal é: " + idealWeight + "kg");

                    System.out.println("Digite 0 para sair ou 1 ou 2 para continuar!");
                    option = sc.nextInt();
                }else if(option == 2){
                    // (62.1 *h) - 44.7
                    idealWeight = (62.1 * height) - 44.7;

                    System.out.println("Seu peso ideal é: " + idealWeight + "kg");

                    System.out.println("Digite 0 para sair ou 1 ou 2 para continuar!");
                    option = sc.nextInt();
                }else{
                    System.out.println("Digitou um número inválido! Por favor, digite novamente:");
                    option = sc.nextInt();
                }
            }
            System.out.println("Fim do programa de IdealWeight!");
        }
    }
