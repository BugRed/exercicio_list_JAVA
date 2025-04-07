package lista02.exercicios;



import java.util.Scanner;

public class TrocaValor {
    /*
        Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores
        de modo que a variável A passe apossuir o valor da variável B, e a variável B
        passe a possuir o valor da variável A. Apresentar os valores trocados.
    */
    public static void main(String[] args) {
        //garantindo que sejam do mesmo tipo
        int a, b, aux;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.println("Digute o valor de B: ");
        b = sc.nextInt();

        System.out.printf("Os valores originais: %d - %d\n", a, b);

        // Trocando o valor das variaveis
        aux = a;
        a = b;
        b = aux;

        System.out.printf("Os valores foram trocados: %d - %d\n", a, b);

        sc.close();
    }
}
