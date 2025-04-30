package lista01.exercicios;

import java.util.Scanner;

public class Execicio02 {

// Faça um programa que:
//  - Leia a cotação do dólar
//  - Leia um valor em dólares
//  - Converta esse valor para Real
//  - Mostre o resultado

    public static void main(String[] args) {
        double cotacaoDolar, valorDolar, valorReal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a cotação atual do dolar: ");
        cotacaoDolar = sc.nextDouble();
        System.out.println("Digite quantos dolares deseja converter em REAL: ");
        valorDolar = sc.nextDouble();

        //o calculo da cotação ficou direto no sout
        System.out.println("O valor: " + valorDolar + " em REAl fica: " + (valorDolar * cotacaoDolar));
    }
}
