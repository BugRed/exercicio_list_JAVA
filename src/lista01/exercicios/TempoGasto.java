package lista01.exercicios;

import java.util.Scanner;

public class TempoGasto {

//    Efetuar o cálculo da quantidade de litros de combustível
//    gasta em uma viagem, utilizando um automóvel que faz 12
//    Km por litro. Para obter o cálculo, o usuário deve fornecer o
//    tempo gasto na viagem e a velocidade média. Desta
//    forma, será possível obter a distância percorrida com
//    a fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o
//    valor da distância, basta calcular a quantidade de
//    litros de combustível utilizada na viagem com a fórmula:
//    LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar
//    os valores da velocidade média, tempo gasto,
//    a distância percorrida e a quantidade de litros utilizada
//    na viagem. Dica: trabalhe com valores reais.

    public static void main(String[] args){
        double tempoGasto, velocidadeMedia, distanciaPercorrida, litrosUtilizados;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tempo gasto com a viagem em horas: ");
        tempoGasto = sc.nextDouble();

        System.out.println("Digite a velocidade média da viagem em km/h: ");
        velocidadeMedia = sc.nextDouble();

        distanciaPercorrida = tempoGasto * velocidadeMedia;
        litrosUtilizados = distanciaPercorrida / 12;

        System.out.println("Uma viagem de " + tempoGasto +"h a uma velocidade média de " + velocidadeMedia + "km/h");
        System.out.println("percorreu " + distanciaPercorrida + "km." + " a quantidade de litros utilizada será de: "
                + litrosUtilizados);


    }
}
