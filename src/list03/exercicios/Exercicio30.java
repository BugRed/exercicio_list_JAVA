package list03.exercicios;

import java.util.Scanner;

public class Exercicio30 {

    /*
        Faça um programa para imprimir uma tabuada.
     */

    public static void main(String[] args) {
        int option;
        char choice = 's';
        Scanner sc = new Scanner(System.in);


        while (choice == 's') {

            System.out.println("Digite o número do qual você quer ver a tabuada: ");
            option = sc.nextInt();

            if (option != 0){
                for (int i = 0; i <= 9; i++){
                    System.out.printf("---------- %d * %d = %d ----------\n", option, i, (option * i));
                }
            } else {
                System.out.println("Qualquer número multiplicado por 0 é 0!");
            }
                System.out.println("Deseja continuar olhando tabuadas de números?(s/n)");
                // Recebendo apenas a primeira letra digitada
                choice = Character.toLowerCase(sc.next().charAt(0));
        };

        System.out.println("Fim do Programa!!");
        sc.close();
    }
}
