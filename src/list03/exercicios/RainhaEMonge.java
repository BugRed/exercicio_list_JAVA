package list03.exercicios;

import java.math.BigInteger;

/**
     * Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço. O monge,
     * necessitando de alimentos, indagou à rainha sobre o pagamento, se poderia ser feito com grãos de
     * trigo dispostos em um tabuleiro de xadrez, de tal forma que o primeiro quadro deveria conter
     * apenas um grão e os quadros subseqüentes, o dobro do quadro anterior. A rainha achou o trabalho
     * barato e pediu que o serviço fosse executado, sem se dar conta de que seria impossível efetuar o
     * pagamento. Faça um programa para calcular o número de grãos que o monge esperava receber.
     * Soma: S = (2 ^ 64) − 1
 */
public class RainhaEMonge {
        public static void main(String[] args) {
            // Usando biginteger pq double deu erro na precisão
            BigInteger totalGrains = BigInteger.ZERO;

            for (int i = 0; i < 64; i++) { // De 0 a 63 (64 casas)
                // Criando a quantidade que esta em cada grão
                BigInteger grainsOnSquare = BigInteger.valueOf(2).pow(i);
                totalGrains = totalGrains.add(grainsOnSquare); // Soma os grãos
                System.out.println("Casa " + (i + 1) + ": " + grainsOnSquare + " grãos");
            }

            System.out.println("\nTotal de grãos que o monge deveria receber: " + totalGrains);
        }
    }
