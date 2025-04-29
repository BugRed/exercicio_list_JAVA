package list03.exercicios;

import javax.xml.stream.events.Characters;
import java.util.Scanner;
/**
     Faça um programa de conversão de base numérica. O programa deverá apresentar uma tela de entrada com as
     seguintes opções:
         1 – Adição
         2 – Subtração
         3 – Multiplicação
         4 – Divisão
     Informe a opção:
     A partir da opção escolhida, o programa deverá solicitar para que o usuário digite dois números. Em seguida,
     o programa deve exibir o resultado da opção indicada pelo usuário e perguntar ao usuário se ele deseja voltar
     ao menu principal. Caso a resposta seja ´S´ ou ´s´, deverá voltar ao menu, caso contrário deverá encerrar
     o programa.
 */


public class ConversaoBaseNumerica {

    public static void addition(int a, int b){
        System.out.printf("%d + %d = %d\n", a, b, (a+b));
    }

    public static void subtraction(int a, int b){
            if (a > b){
                System.out.printf("%d - %d = %d\n", a, b, (a-b));
            } else {
                System.out.printf("%d - %d = %d\n", b, a, (b-a));
            }
    }

    public static void multiplication(int a, int b){
        System.out.printf("%d * %d = %d\n", a, b, (a*b));
    }

    public static void division(int a, int b){
        System.out.printf("%d * %d = %d\n", a, b, (a*b));
    }

    public static void main(String[] args) {
        int option;
        char  choise;

        int a, b;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite o primeiro número: ");
            a = sc.nextInt();

            System.out.println("Digite o segundo número: ");
            b = sc.nextInt();

            sc.nextLine();

            // mais aspas duplas significam um espaço(\n) no começo e no fim
            System.out.println(""" 
                                Escolha uma opção abaixo:
                                1 – Adição
                                2 – Subtração
                                3 – Multiplicação
                                4 – Divisão
                    """);
            option = sc.nextInt();

            switch (option){
                case 1:
                    addition(a,b);
                    break;
                case 2:
                    subtraction(a,b);
                    break;
                case 3:
                    multiplication(a, b);
                    break;
                case 4:
                    division(a, b);
                    break;
                default:
                    System.out.println("Digitou uma opção inválida!");
                    break;
            }
            sc.nextLine();
            System.out.println("Deseja continuar executando operações?(s/n)");
            choise = sc.nextLine().charAt(0);
        } while(choise != 'n');
        System.out.println("Fim do programa!");
        sc.close();
    }


}
