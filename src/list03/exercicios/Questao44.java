package list03.exercicios;


import java.util.Scanner;

/**
 * Faça um programa que exiba as opções:
         * 1 – Conversão de Graus Celsius em Graus Fahrenheit
         * 2 – Conversão de Graus Fahrenheit em Graus Celsius
         * 3 – Peso ideal do homem
         * 4 – Peso ideal da mulher
         * O programa só deve encerrar quando o usuário digitar ´S´ para a pergunta “Deseja encerrar o programa?” Obs.:
         * Nas opções 3 e 4 informar se o usuário está acima ou abaixo do peso ideal.*/
public class Questao44 {

    public static void ConvertTemperature (Scanner sc){
        int option = 0;

        System.out.println("Digite qual conversão deseja fazer: ");
        System.out.println("============ 1 - CELSIUS PARA FAHRENHEIT =============");
        System.out.println("============ 2 - FAHRENHEIT PARA CELSIUS =============");
        option = sc.nextInt();

        //menu para manter o programa ativo mesmo após a resolução de um ou mais ifs
        while (option != 0){

            //decisão sobre conversão
            if (option == 1){
                System.out.println("Digite a temperatura em graus Celsius: ");
                double celsius = sc.nextDouble();
                System.out.println("A temperatura em Fahrenheit é: " + ((9 * celsius + 160) / 5) + "º");

                System.out.println("Digite 0 para sair ou 1 ou 2 para continuar!");
                option = sc.nextInt();
            }else if(option == 2){
                System.out.println("Digite a temperatura em graus Farenheit: ");
                double fahrenheit = sc.nextDouble();
                System.out.println("A temperatura em Celsius é: " + ((fahrenheit - 32) * 5 / 9) + "º");

                System.out.println("Digite 0 para sair ou 1 ou 2 para continuar!");
                option = sc.nextInt();
            }else{
                System.out.println("Digitou um número inválido! Por favor, digite novamente:");
                option = sc.nextInt();
            }
        }
        System.out.println("Fim do programa de Conversão de Temperatura!");
    }

    public static void idealWeight (Scanner sc){
        int option = 1;

        //menu para manter o programa ativo mesmo após a resolução de um ou mais ifs
        while (option != 0){
            double weight, height, IMC;

            System.out.println("Digite o peso em quilos: ");
            weight = sc.nextDouble();

            System.out.println("Digite a altura em metros: ");
            height = sc.nextDouble();

            IMC = weight / Math.pow(height, 2);

            System.out.println("Você é HOMEM(1) ou MULHER(2)? ");
            option = sc.nextInt();


            if (option == 1){

                if (IMC < 18.5){
                    System.out.println("Homem abaixo do Peso!");
                } else if (IMC >= 18.5 && IMC <= 24.9) {
                    System.out.println("Homem com peso Ideal!");
                } else if (IMC >= 25 && IMC <= 29.9) {
                    System.out.println("Homem acima do Peso!");
                } else if (IMC >= 30 && IMC <= 34.9) {
                    System.out.println("Homem obeso!");
                } else if (IMC >= 35 && IMC <= 39.9) {
                    System.out.println("Homem muito obeso!");
                } else {
                    System.out.println("Homem com obesidade grave!");
                }

                System.out.println("Digite 0 para sair ou 1 ou 2 para continuar!");
                option = sc.nextInt();
            }else if(option == 2){

                if (IMC < 18.5){
                    System.out.println("Mulher abaixo do Peso!");
                } else if (IMC >= 18.5 && IMC <= 24.9) {
                    System.out.println("Mulher com peso Ideal!");
                } else if (IMC >= 25 && IMC <= 29.9) {
                    System.out.println("Mulher acima do Peso!");
                } else if (IMC >= 30 && IMC <= 34.9) {
                    System.out.println("Mulher obesa!");
                } else if (IMC >= 35 && IMC <= 39.9) {
                    System.out.println("Mulher muito obesa!");
                } else {
                    System.out.println("Mulher com obesidade grave!");
                }

                System.out.println("Digite 0 para sair ou 1 ou 2 para continuar!");
                option = sc.nextInt();
            }else{
                System.out.println("Digitou um número inválido! Por favor, digite novamente:");
                option = sc.nextInt();
            }
        }
        System.out.println("Fim do programa de IMC!");
    }


    public static void main(String[] args) {

        char choise = ' ';

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("O que deseja fazer?");
            System.out.println("============== 1 - CONVERSÃO DE TEMPERATURA =============");
            System.out.println("============== 2 - IMC                      =============");
            System.out.println("============== 0 - SAIR                     =============");
            choise = sc.next().charAt(0);
            sc.nextLine();

            switch (choise){
                case '1':
                    ConvertTemperature(sc);
                    break;
                case '2':
                    idealWeight(sc);
                    break;
                case '0':
                    System.out.println("Fim do programa!");
                    break;
            }

            System.out.println("Deseja continuar(s/n)?:");
            choise = sc.next().charAt(0);

        }while(Character.toUpperCase(choise) == 'S');
        sc.close();
        System.out.println("Fim do programa!");
    }
}
