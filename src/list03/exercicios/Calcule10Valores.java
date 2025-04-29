package list03.exercicios;

import java.util.Scanner;

public class Calcule10Valores {
    /*
        Faça um programa que leia 10 valores inteiros e positivos e:
            - Encontre o maior valor
            - Encontre o menor valor
            - Calcule a média dos números lidos
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

    public static void main(String[] args) {
        double sum = 0.0, average = 0.0;

        int[] vetor = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++){
            System.out.printf("Digite o %d número: \n", (i+1));
            vetor[i] = sc.nextInt();
            sum += vetor[i];
        }

        average = sum / vetor.length;

        int[] vetorOrder = Order(vetor);

        System.out.printf("O maior número da lista é o: %d\n", vetorOrder[0]);
        System.out.printf("O menor número da lista é o: %d\n", vetorOrder[vetorOrder.length - 1]);

        System.out.printf("A média entre os números é de: %.2f", average);




    }
}
