package list03.exercicios;

import java.util.Scanner;

public class Exercicio38 {
    /*
        Faça um programa que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um
        operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a
        50, calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora
        excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.
        O programa só deve parar de rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o
        programa?".
    */

    public static class Employee{
        int cod_employee;
        double workExtraHour;
        double workHour;
        double salary;


        public Employee(int cod_employee, double workHour) {
            this.cod_employee = cod_employee;
            this.workHour = workHour;
        }
        public void calcSalary(){
            // Horas = 10/h
            // Horas > 50 então Houras = 20/h

            if (workHour <= 50){
                // Se não há horas excedentes não há horas extras
                workExtraHour = 0;
                // O calculo do salario será então todas as horas que trabalhou + 0 extras;
                salary = (workHour * 10.00) + workExtraHour;
            } else {
                // Se há horas extras então se extrai as horas extras acima de 50 e multiplica por 20
                this.workExtraHour = (workHour - 50) * 20.00;
                salary = (50 * 10.00) + this.workExtraHour;
            }

            System.out.println(this);
        }

        @Override
        public String toString() {
            return "Funcionário:" +
                    "\nCodigo de funcionário: " + cod_employee +
                    " \nHoras extras Trabalhadas: " + workExtraHour +
                    " \nSalário: " + salary;
        }
    }

    public static void main(String[] args) {
        int cod_employee, workHour;
        char option;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite o código do funcionário: ");
            cod_employee = sc.nextInt();

            System.out.println("Digite o número de horas trabalhadas pelo funcionário: ");
            workHour = sc.nextInt();

            // Instanciando o objeto
            Employee funcionario = new Employee(cod_employee, workHour);

            funcionario.calcSalary();


            System.out.println("Deseja continuar ou deseja sair? (S/N)");
            option = sc.next().charAt(0);

        }while(Character.toUpperCase(option) == 'S');

        System.out.println("Fim do programa!");

        sc.close();
    }
}
