package list03.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
         * Faça um programa que determine o maior e o menor entre N números lidos.
         * A condição de parada é a entrada de um valor 0, ou seja, o programa
         * deve ficar executando até que a entrada seja igual a 0 (ZERO).
*/
public class ParadaZero {
    /**
                * SELECTION SORT
     * */
    public static List<Integer> OrderNumbers(List<Integer> numbers) {
        int aux;
        for (int i = 0; i < numbers.size() - 1; i++) {
            int minorValue = i;
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(j) < numbers.get(minorValue)) { // comparar com minorValue
                    minorValue = j;
                }
            }
            if (minorValue != i) { // troca somente se necessário
                aux = numbers.get(minorValue);
                numbers.set(minorValue, numbers.get(i));
                numbers.set(i, aux);
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite números (0 para parar):");

        while (true) {  // Loop infinito controlado pelo break
            int option = sc.nextInt();

            if (option == 0) {
                break;
            } else {
                numbers.add(option); // adiciona o número
            }
        }

        if (!numbers.isEmpty()) {
            // Ordena para saber o maior e o menor
            List<Integer> orderNumbers = OrderNumbers(numbers);

            System.out.println("Números em ordem crescente: " + orderNumbers);
            System.out.println("Menor número: " + orderNumbers.getFirst());
            System.out.println("Maior número: " + orderNumbers.getLast());
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        System.out.println("Fim do programa!");
        sc.close();
    }


}
