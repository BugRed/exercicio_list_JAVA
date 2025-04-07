package lista02.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class NumerosMaioresQue0 {
    /*
    Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor maior que zero para cada
    variável (se o valor digitado não é válido, mostrar mensagem e ler novamente). Exibe o menor valor lido
    multiplicado pelo maior e o maior valor dividido pelo menor.
     */

    // Criando uma função de ordenação para facilitar achar o menor e maior números
    public static int[] Order(int[] list){
        int aux;
        // Esse For serve para impedir que se acesse indices acima de dec.length, isso gera um erro
        for (int i = 0; i < list.length - 1 ; i++){
            // Esse For serve para fazer a mudança de local dos números
            for (int j = 0; j < list.length - 1 - i ; j++){
                //Caso o número da esquerda seja menor que o da direita, eles mudam de posição
                if(list[j] < list[j+1]){
                    aux = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = aux;
                }
            }
        }


        return list;
    }

    public static void main(String[] args){
        int[] values = new int[3];
        double greater, smaller;

        Scanner sc = new Scanner(System.in);

        // Preenchendo o vetor com valores diferentes de zero
        for (int i = 0; i < values.length; i++){
            System.out.printf("Digite o %dº valor: ", (i+1));
            values[i] = sc.nextInt();
            while (values[i] == 0){
                System.out.println("Por favor digite um número diferente de 0");
                values[i] = sc.nextInt();
            }
        }

        // Chamando a função de ordenação
        int[] list = Order(values);

        greater = list[0];
        smaller = list[2];

        System.out.printf("O menor valor lido (%.2f) multiplicado pelo maior valor lido (%.2f) é = %.2f\n\n", smaller, greater, (smaller * greater));
        System.out.printf("O maior valor lido (%.2f) dividido pelo menor valor lido (%.2f) é = %.2f\n\n", greater, smaller, (greater/smaller));

        sc.close();



    }
}
