package lista02.exercicios;


import java.util.Scanner;

/**
 * Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas: 1 – Adição
 2 – Subtração
 3 – Multiplicação
 4 – Divisão
 * */
public class Exercicio23 {

    public static int menu(Scanner sc) {
        int option;
        System.out.println("O que deseja executar:    ");
        System.out.println("         1 - Adição       ");
        System.out.println("         2 - Subtração    ");
        System.out.println("         3 - Multiplicação");
        System.out.println("         4 - Divisão      ");
        System.out.println("         0 - Sair         ");
        option = sc.nextInt();

        return option;
    }

    public static void addition(int a, int b){
        System.out.printf("O resultado de %d + %d = %d\n", a, b, (a+b));
    }

    public static void subtraction(int a, int b){
         if (a > b){
            System.out.printf("O resultado de %d - %d = %d\n", a, b, (a-b));
        } else {
            System.out.printf("O resultado de %d - %d = %d\n", b, a, (b-a));
        }
    }

    public static void multiplication(int a, int b){

        System.out.printf("O resultado de %d * %d = %d\n", a, b, (a*b));

    }


    public static void division(int a, int b){

        if (a > b){
            System.out.printf("O resultado de %d / %d = %d\n", a, b, (a/b));
        } else {
            System.out.printf("O resultado de %d / %d = %d\n", b, a, (b/a));
        }

    }


    public static void main(String[] args) {
        int option, a, b;
        char choise;

        Scanner sc = new Scanner(System.in);

        do {
            if ((option = menu(sc)) == 0){
                break;
            } else {
                System.out.println("Digite o primeiro número: ");
                a = sc.nextInt();

                System.out.println("Digite o segundo número: ");
                b = sc.nextInt();

                switch (option){
                    case 1: addition(a,b);
                        break;
                    case 2: subtraction(a,b);
                        break;
                    case 3: multiplication(a,b);
                        break;
                    case 4: division(a,b);
                        break;
                }
                System.out.println("Deseja continuar? (s/n)");
                choise = sc.next().charAt(0);
            }
        } while(Character.toLowerCase(choise) != 'n');

        System.out.println("Fim do programa!");
        sc.close();
    }
}
