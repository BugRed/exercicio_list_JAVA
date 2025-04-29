package list03.exercicios;

import java.util.Scanner;

/**
     * A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03 grupos de indústrias que são altamente
     * poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as
     * indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as industrias do
     * 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
     * notificados a paralisarem suas atividades. Faça um programa que leia o índice de poluição medido e emita a
     * notificação adequada aos diferentes grupos de empresas. O algoritmo só deve parar de rodar quando o usuário
     * responder "S" na seguinte pergunta, "Deseja encerrar o programa?".
 * */
public class SecretariaAmbiente {

    public static void main(String[] args){
        // INDICE = 0,05 até 0,25
        // if INDICE = 0,3 == industrias 1
        // if INDICE = 0,4 == induastrias 1 e 2
        // if INDICE = 0,5 == all insdustrias


        double indice;
        char choise;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite o indice medido para conferir:");
            indice = sc.nextDouble();

            if (indice >= 0.5) {
                System.out.println("Alerta emitido para industrias de 1º, 2º e 3º ordem!");
            } else if (indice >= 0.4) {
                System.out.println("Alerta emitido para industrias de 1º e 2º ordem!");
            } else if (indice >= 0.3) {
                System.out.println("Alerta emitido para industrias de 1º ordem!");
            } else if (indice >= 0.05 && indice <= 0.25){
                System.out.println("O índice: " + indice + " é aceitável!");
            } else {
                System.out.println("Índice fora da faixa monitorada!");
            }


            System.out.println("Deseja continuar conferindo números? (s/n)");
            choise = sc.next().charAt(0);
        }while (Character.toLowerCase(choise) == 's');

        sc.close();
        System.out.println("Fim do programa!");
    }
}
