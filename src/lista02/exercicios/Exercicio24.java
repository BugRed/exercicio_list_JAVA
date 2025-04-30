package lista02.exercicios;


import java.util.Scanner;

/**
 * Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que deseja
 * realizar:
 * 1 – Verificar se um dos números lidos é ou não múltiplo do outro
 * 2 – Verificar se os dois números lidos são pares
 * 3 – Verificar se a média dos dois números é maior ou igual a 7.
 * 4 – Sair*/
public class Exercicio24 {
    /**
     * Verificar se um dos números lidos é ou não múltiplo do outro
     * */
    public static void multiply(int a, int b){
        if (b != 0 && a % b == 0) {
            System.out.println(a + " é múltiplo de " + b);
        } else if (a != 0 && b % a == 0) {
            System.out.println(b + " é múltiplo de " + a);
        } else {
            System.out.println("Nenhum número é múltiplo do outro.");
        }
    }
/**
 * Verificar se os dois números lidos são pares*/
    public static void odds(int a, int b){
        if (a % 2 == 0 && b % 2 == 0){
            System.out.println("Ambos são pares!");
        } else if (a % 2 == 0){
            System.out.println("Apenas " + a + " é par!");
        } else if (b % 2 == 0) {
            System.out.println("Apenas " + b + " é par!");
        } else {
            System.out.println("Nenhum dos números é par!");
        }
    }
    /**Verificar se a média dos dois números é maior ou igual a 7.*/
    public static void average(int a, int b){
        System.out.println("A média entre " + a + " e " + b + " é igual a: " + ((a + b) / 2) );
    }


public static void main(String[] args) {
        int a, b, option;
        char choise;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        a = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        b = sc.nextInt();

        do {
            System.out.println("O que deseja fazer? ");
            System.out.println("=== 1 – Verificar se um dos números lidos é ou não múltiplo do outro ===");
            System.out.println("=== 2 – Verificar se os dois números lidos são pares                 ===");
            System.out.println("=== 3 – Verificar se a média dos dois números é maior ou igual a 7.  ===");
            System.out.println("=== 4 – Sair                                                         ===");

            option = sc.nextInt();


            if (option == 4){
                break;
            } else {
                switch (option){
                    case 1: multiply(a,b);
                    break;
                    case 2: odds(a,b);
                    break;
                    case 3: average(a,b);
                }
            }


            System.out.println("Deseja continuar?");

            choise = sc.next().charAt(0);

        }while (Character.toLowerCase(choise) != 'n');
        sc.close();
        System.out.println("Fim do programa!");
    }

}
