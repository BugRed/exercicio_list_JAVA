package lista02.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemDec {
    /*
        Escreva um programa que leia 3 números inteiros e imprima na tela os valores em ordem decrescente.
    */
    public static void main(String[] args){
        int aux;
        int[] dec = new int[3];

        Scanner sc = new Scanner(System.in);

        // Enchendo o Array com os números
        for (int i = 0; i < dec.length ; i++){
            System.out.printf("Digite o %dº número\n", (i+1));
            dec[i] = sc.nextInt();
        }

        System.out.println("Números em ordem original: " + Arrays.toString(dec));

        // Esse For derve para impedir que se acesse indices acima de dec.length, isso gera um erro
        for (int i = 0; i < dec.length - 1 ; i++){
            // Esse For serve para fazer a mudança de local dos números
            for (int j = 0; j < dec.length - 1 - i ; j++){
                //Caso o número da esquerda seja menor que o da direita, eles mudam de posição
                if(dec[j] < dec[j+1]){
                    aux = dec[j];
                    dec[j] = dec[j + 1];
                    dec[j + 1] = aux;
                }
            }
        }
        
        System.out.println("Números em ordem decrescente: " + Arrays.toString(dec));

        sc.close();

    }
}
