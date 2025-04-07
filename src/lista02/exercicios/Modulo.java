package lista02.exercicios;

import java.util.Scanner;

public class Modulo {
    /*
     Escreva um programa que leia um número inteiro e exiba o seu módulo. O módulo de um
     número x é: x se x é maior ou igual a zero x * (-1) se x é menor que zero
    */
    public static void main(String[] args){
        int x, mod;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        x = sc.nextInt();

        // Descobrindo se o número é positivo ou negativo
        if (x >= 0){
            mod = x;
            System.out.printf("O módulo de %d é = %d", x, mod);
        }else{
            mod = x * (-1);
            System.out.printf("O módulo de %d é = %d", x, mod);
        }
        sc.close();
    }
}
