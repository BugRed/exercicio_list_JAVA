package list03.exercicios;

public class Multiplo10 {
    /*
        Faça um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma mensagem: "Múltiplo de 10".
    */

    public static void main(String[] args) {


        // Contando de 1 a 100
        for (int i = 1; i < 101; i++){
            // Decidindo se é multiplo
            if(i % 10  == 0){
                System.out.printf("O número %d é muitiplo de 10\n", (i));
            }
        }
    }
}
