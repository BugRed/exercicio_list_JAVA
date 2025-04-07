package lista01.exercicios;

import java.util.Scanner;

public class ConversorFahrenheitCelsius {
//    - Ler uma temperatura em graus Celsius e apresentá-Ia
//    convertida em graus Fahrenheit. A fórmula de conversão de
//    temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a
//    variável F representa é a temperatura em graus
//    Fahrenheit e a variável C representa é a temperatura
//    em graus Celsius.
//
//    - Ler uma temperatura em graus Fahrenheit e apresentá-Ia
//    convertida em graus Celsius. A fórmula de conversão de
//    temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a
//    variável F é a temperatura em graus Fahrenheit e a
//    variável C é a temperatura em graus Celsius.

    public static void main(String[] args) {
        double fahrenheit, celsius;
        int option;

        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja converter de Celsius para Fahrenheit(1)?");
        System.out.println("Ou prefere converter de Fahrenheit para Celsius(2)?");
        option = sc.nextInt();

        //menu para manter o programa ativo mesmo após a resolução de um ou mais ifs
        while (option != 0){

            //decisão sobre conversão
            if (option == 1){
                System.out.println("Digite a temperatura em graus Celsius: ");
                celsius = sc.nextDouble();
                System.out.println("A temperatura em Fahrenheit é: " + ((9 * celsius + 160) / 5) + "º");

                System.out.println("Digite 0 para sair ou 1 ou 2 para continuar!");
                option = sc.nextInt();
            }else if(option == 2){
                System.out.println("Digite a temperatura em graus Farenheit: ");
                fahrenheit = sc.nextDouble();
                System.out.println("A temperatura em Celsius é: " + ((fahrenheit - 32) * 5 / 9) + "º");

                System.out.println("Digite 0 para sair ou 1 ou 2 para continuar!");
                option = sc.nextInt();
            }else{
                System.out.println("Digitou um número inválido! Por favor, digite novamente:");
                option = sc.nextInt();
            }
        }
        System.out.println("Fim do programa!");


    }
}
