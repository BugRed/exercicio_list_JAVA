package list03.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class AlunosMediaProva {
    /*
        Escreva um programa que calcule e exiba a média da nota dos alunos de uma turma em uma prova. O número de
        alunos é desconhecido. Os dados de um aluno são: número de matrícula e a sua nota na prova em questão.
    */

    // Criando o Objeto Aluno
    public static class Aluno {

        String name;
        int matricula;
        double nota;

        public Aluno(String name, int matricula, double nota){
            this.name = name;
            this.matricula = matricula;
            this.nota = nota;
        }

        public String name() {
            return name;
        }

        public int matricula() {
            return matricula;
        }

        public double nota() {
            return nota;
        }


        @Override
        public String toString() {
            return "\nAluno: " +
                    "nome='" + name + '\'' +
                    ", matricula=" + matricula +
                    ", nota=" + nota;
        }
    }

    public static void main(String[] args) {
        int option = 1;
        String name;
        int matricula;
        double nota, sum = 0, average = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas alunos estudam nesta turma?");
        option = sc.nextInt();

        sc.nextLine();

        ArrayList<Aluno> listAluno = new ArrayList<>();

        // Preenchendo o array com os objetos
        while (option != 0){

            System.out.println("Digite o nome do aluno:");
            name = sc.nextLine();

            System.out.println("Digite a matricula do aluno: ");
            matricula = sc.nextInt();

            System.out.println("Digite a nota do aluno: ");
            nota = sc.nextDouble();

            listAluno.add(new Aluno(name, matricula, nota));

            // decrecendo a variavel para sair do loop
            option--;
            // serve para limpar o buffer
            sc.nextLine();

        }

        for (Aluno a : listAluno){
            sum += a.nota;
        }

        average = sum / listAluno.size();

        System.out.println("Esses são todos os alunos e suas notas: ");
        System.out.println(listAluno);

        System.out.printf("A média da turma é de: %.2f", average);


    }
}
