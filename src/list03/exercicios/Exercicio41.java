package list03.exercicios;

import java.util.Scanner;

/**
         * Faça um programa que dada a idade de um nadador,
         * classifique-o em uma das seguintes categorias:
         * - Infantil A = 5 a 7 anos
         * - Infantil B = 8 a 11 anos
         * - Juvenil A = 12 a 13 anos
         * - Juvenil B = 14 a 17 anos
         * - Adultos = Maiores de 18 anos
 * */
public class Exercicio41 {

    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        age = sc.nextInt();

        if (age >= 5 && age <= 7){
            System.out.println("Infantil A");
        } else if (age >= 8 && age <= 11){
            System.out.println("Infantil B");
        } else if (age >= 12 && age <= 13){
            System.out.println("Juvenil A");
        } else if (age >= 14 && age <= 17){
            System.out.println("Juvenil B");
        } else if (age >= 18){
            System.out.println("Adulto");
        } else {
            System.out.println("Ainda não pode competir!");
        }
        sc.close();
    }

}
