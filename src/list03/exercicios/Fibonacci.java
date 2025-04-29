package list03.exercicios;

import java.math.BigInteger;

/**
 * Algoritmo que pode executar a sequencia de fibonacci
 * */

public class Fibonacci {
    /**
     * Sequencia de fibonacci*/
    public static void executeFibonacci(int n) {
        // Definindo dos números
        BigInteger a = BigInteger.ZERO, b = BigInteger.ONE;
        // Printando 0 e 1 por serem o inicio da sequencia
        System.out.print(a + " " + b + " ");

        // for percorre o numero de algorismos solicitado
        for (int i = 2; i < n; i++) {
            // Somo os dois numeros e determino o proximo na sucessão
            BigInteger next = a.add(b);
            // printo o proximo
            System.out.print(next + " ");
            // o primeiro numero recebe o segundo
            a = b;
            // o segundo numero recebe o proximo
            b = next;
        }
    }

    public static void main(String[] args) {
        executeFibonacci(100);
    }

}
