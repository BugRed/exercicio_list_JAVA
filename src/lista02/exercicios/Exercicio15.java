package lista02.exercicios;

import java.util.Scanner;

public class Exercicio15 {
    /*
    Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi
    aprovado se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a
    nota do recuperação, somar com o valor da média e obter a nova média. Se a nova média for maior ou igual a 7,
    apresentar uma mensagem informando que o aluno foi aprovado na recuperação. Se o aluno não foi aprovado,
    apresentar uma mensagem informando esta condição. Apresentar junto com as mensagens o valor da média do aluno.
    */

    public static void main(String[] args){

        double[] schoolGrades = new double[4];
        double totalSchoolGrades = 0, retakingExams = 0, average;

        Scanner sc = new Scanner(System.in);

        // Pegando todas as notas
        for (int i = 0; i < schoolGrades.length ; i++){
            System.out.printf("Digite a %dº nota\n", (i+1));
            schoolGrades[i] = sc.nextDouble();
            // Somando todas as notas
            totalSchoolGrades += schoolGrades[i];
        }

        average = totalSchoolGrades / schoolGrades.length;

        if (average >= 7){
            System.out.println("Esse aluno foi APROVADO com média: " + average);
        } else {
            System.out.println("Esse aluno está de RECUPERAÇÃO! Sua média foi " + average);
            System.out.println("Digite a nota de recuperação deste aluno: ");
            retakingExams = sc.nextDouble();

            // Refazendo a média
            average = (average + retakingExams) / 2;

            if (average >= 7){
                System.out.println("Esse aluno foi APROVADO na RECUPERAÇÃO com média: " + average);
            } else {
                System.out.println("Esse aluno está REPROVADO! Sua média foi " + average);
            }

        }
        sc.close();
    }
}
