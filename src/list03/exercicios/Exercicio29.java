package list03.exercicios;

public class Exercicio29 {
    /*
        Faça um programa que exiba os números de 1 até 2000.
    */

    public static void main(String[] args){

        // Os dois codigos fazem a mesma coisa se formas diferentes;
//        int[] numbers = new int[2000];
//
//        // Preenchendo o array com números de 1 a 2000
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i + 1;
//            System.out.println(numbers[i]);
//        }
        int a = 1;

        do {
            System.out.println(a);
            ++a;
        }while(a <= 2000);
    }
}
