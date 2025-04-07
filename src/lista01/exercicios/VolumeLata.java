package lista01.exercicios;

import java.util.Scanner;

public class VolumeLata {
//    Calcular e apresentar o valor do volume
//    de uma lata de óleo, utilizando a fórmula:
//    V = 3.14159 * R * R * A
//    Onde as variáveis: V, R e A representam
//    respectivamente o volume, o raio e a altura.

    public static void main(String[] args) {
        double altura, raio;
        final double PI = 3.14159;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio da lata: ");
        raio = sc.nextDouble();

        System.out.println("Digite a altura da lata: ");
        altura = sc.nextDouble();

        System.out.printf("O Volume desta lata é de: %.2f" , (PI * Math.pow(raio, 2.0) * altura));
    }
}
