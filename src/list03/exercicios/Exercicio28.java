package list03.exercicios;

public class Exercicio28 {

    /*
        Faça um programa que gera e escreve os números ímpares dos números lidos entre 100 e 200.
    */

    public  static void main(String[] args){

        int[] numbers = new int[100];

        // Preenchendo o array com números de 1 a 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 100;
            if (numbers[i] % 2 != 0){
                System.out.printf("O número %d é impar!\n", numbers[i]);
            }
        }
    }
}
