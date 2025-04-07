package lista02.exercicios;

import java.util.Scanner;

public class Triangulos {
    /*
    Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C). Verificar se
    cada lado é menor que a soma dos outros dois lados. Se sim, saber de A==B e se B==C, sendo verdade o
    triângulo é eqüilátero; Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é
    isósceles; e caso contrário, o triângulo será escaleno. Caso os lados fornecidos não caracterizarem
    um triângulo, avisar a ocorrência.
     */

    public static void main(String[] args){
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        a = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = sc.nextInt();

        System.out.println("Digite o terceiro valor: ");
        c = sc.nextInt();

        // Condição de cada número precisa ser menor que a soma dos outros dois
        if (b < (a + c) && a < (b + c) && c < (a + b)){
            if (a == b && b == c){
                System.out.println("Triângulo Equilátero!");
            } else if (a == b || a == c || b == c){
                System.out.println("Triângulo Isósceles!");
            } else {
                System.out.println("Triângulo Escaleno!");
            }
        } else {
            System.out.println("Esse números não formam um triangulo");
        }
        sc.close();
    }
}
