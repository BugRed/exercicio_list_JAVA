package lista01.exercicios;

import java.util.Scanner;

public class PropriedadeDistribuitiva {
//    Ler quatro valores numéricos inteiros e apresentar o resultado dois a
//    dois da adição e multiplicação entre os valores
//    lidos, baseando-se na utilização do conceito de propriedade
//    distributiva.
//    Dica: se forem lidas as variáveis A, B, C e D,
//    devem ser somados e multiplicados os valores de
//    A com B, A com C e A com D; depois B com C, B com D e por
//    último C com D. Note que para cada operação serão utilizadas
//    seis combinações. Assim sendo, devem ser
//    realizadas doze operações de processamento, sendo seis para
//    as adições e seis para as multiplicações.

    public static void main(String[] args) {
        int a, b, c, d;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        a = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        b = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        c = sc.nextInt();

        System.out.println("Digite o quarto numero: ");
        d = sc.nextInt();

        System.out.println("------------------ADIÇÕES DOIS A DOIS-------------------");

        System.out.println("A Soma entre " + a + " e " + b + " é igual a: " + (a + b) );
        System.out.println("A Soma entre " + a + " e " + c + " é igual a: " + (a + c) );
        System.out.println("A Soma entre " + a + " e " + d + " é igual a: " + (a + d) );
        System.out.println("A Soma entre " + b + " e " + c + " é igual a: " + (b + c) );
        System.out.println("A Soma entre " + b + " e " + d + " é igual a: " + (b + d) );
        System.out.println("A Soma entre " + c + " e " + d + " é igual a: " + (c + d) );

        System.out.println("------------------MULTIPLICAÇÕES DOIS A DOIS-------------------");

        System.out.println("A multiplicação entre " + a + " e " + b + " é igual a: " + (a * b) );
        System.out.println("A multiplicação entre " + a + " e " + c + " é igual a: " + (a * c) );
        System.out.println("A multiplicação entre " + a + " e " + d + " é igual a: " + (a * d) );
        System.out.println("A multiplicação entre " + b + " e " + c + " é igual a: " + (b * c) );
        System.out.println("A multiplicação entre " + b + " e " + d + " é igual a: " + (b * d) );
        System.out.println("A multiplicação entre " + c + " e " + d + " é igual a: " + (c * d) );

        System.out.println("------------------PROVANDO PROPRIEDADE DISTRIBUTIVA-------------------");

        System.out.printf("%d * ( %d + %d ) = %d\n", a, b, c, (a * (b + c)) );
        System.out.printf("%d * %d + %d * %d = %d\n", a,b,a,c, (a * b + a * c));
        System.out.printf("Logo %d = %d\n", (a * (b + c)), (a * b + a * c));




    }
}
