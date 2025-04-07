package lista02.exercicios;

import java.util.Scanner;

public class PositivoANegativoB {
    /*
    Faça um programa que leia um número. Se positivo armazene-o em A, se for negativo, em B. No final mostrar o
    resultado.
     */

    public static void main(String[] args){
        int x, a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número qualquer");
        x = sc.nextInt();

        if (x >= 0){
            a = x;
            System.out.printf("A Váriavel A recebeu o valor %d\n", x);
        } else {
            b = x;
            System.out.printf("A Váriavel B recebeu o valor %d\n", x);
        }
        sc.close();
    }
}
