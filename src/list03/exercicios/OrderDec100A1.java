package list03.exercicios;

import java.util.Arrays;

public class OrderDec100A1 {

    /*
        Escreva um programa que exiba os números de 1 a 100 na tela em ordem decrescente.
    */

    // Criando uma função de ordenação para facilitar achar o menor e maior números
    public static int[] Order(int[] list){
        int aux = 0;
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
        int[] dec = new int[100];

        // Preenchendo o array com números de 1 a 100
        for (int i = 0; i < dec.length; i++) {
            dec[i] = i + 1;
        }

        int[] listDecOrder = Order(dec);

        System.out.println(Arrays.toString(listDecOrder));
    }
}
