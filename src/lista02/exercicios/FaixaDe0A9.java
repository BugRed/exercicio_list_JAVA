package lista02.exercicios;

import java.util.Scanner;

public class FaixaDe0A9 {
    /*
    Escreva um programa que leia um número inteiro. Verificar por meio de condição se o valor fornecido está na faixa
    entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor válido”.
    Caso contrário, apresentar a mensagem “valor inválido”.
     */

    public static void main(String[] args){
        int x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        x = sc.nextInt();

        // Decisão da faixa de 0 a 9
        if(x >=0 && x<=9){
            System.out.println("Número válido!");
        } else {
            System.out.println("Número Inválido!");
        }
        sc.close();
    }
}
