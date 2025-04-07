package lista02.exercicios;

import java.util.Scanner;

public class CodigoAcesso {
    /*
    Escreva um programa que leia um número inteiro (variável CODIGO). Verificar se o código é igual a 1, igual a 2 ou
    igual a 3. Caso não seja, apresentar a mensagem “Código inválido”. Ao ser verificado o código e constatado que é
    um valor válido, o programa deve verificar cada código em separado para determinar seu valor por extenso, ou seja,
    apresentar a mensagem “um”, ”dois” ou “três”. (Utilizar o comando Switch).
     */

    public static void main(String[] args){
        int codigo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o código de acesso: ");
        codigo = sc.nextInt();


        // Decisão de foi digitado algum número entres 1, 2, 3
        if (codigo == 1 || codigo == 2 || codigo == 3) {
            switch (codigo) {
                case 1:
                    System.out.println("um");
                    break;
                case 2:
                    System.out.println("dois");
                    break;
                case 3:
                    System.out.println("três");
                    break;
            }
        } else {
            System.out.println("Código Inválido!");
        }

        sc.close();
    }
}
