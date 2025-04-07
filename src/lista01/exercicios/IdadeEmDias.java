package lista01.exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class IdadeEmDias {

//    Faça um algoritmo que leia a idade de uma
//    pessoa expressa em anos, meses e dias e
//    escreva a idade dessa pessoa
//    expressa apenas em dias. Considerar ano
//    com 365 dias e mês com 30 dias.
//
//    Regras para um ano bissexto:
//    - Um ano divisível por 4 é bissexto.
//    - Exceto se o ano for divisível por 100, a menos que
//      também seja divisível por 400.


    public static void WithLibChronoUnit(Locale locale, Scanner sc) {

        int dia, mes, ano;
        //formatador de datas para imprimir mais orgaizado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", locale);

        System.out.println("Digite o dia do seu nascimento: ");
        dia = sc.nextInt();

        System.out.println("Digite o mes do seu nascimento: ");
        mes = sc.nextInt();

        System.out.println("Digite o ano do seu nascimento: ");
        ano = sc.nextInt();


        //criando a data de nascimento como LocalDate
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        //pegando a data de hj
        LocalDate hoje = LocalDate.now();
        // Usando biblioteca ChronoUnit para o calculo dos dias;
        long diasAteHoje = ChronoUnit.DAYS.between(dataNascimento, hoje);
        System.out.println("Esse individuou viveu " + diasAteHoje + " dias na Terra.");


    }

    public static void WithoutLib(Locale locale, Scanner sc) throws ParseException {

        int dia, mes, ano;
        SimpleDateFormat formmatter = new SimpleDateFormat("dd/MM/yyyy", locale);

        System.out.println("Digite o dia do seu nascimento: ");
        dia = sc.nextInt();

        System.out.println("Digite o mes do seu nascimento: ");
        mes = sc.nextInt();

        System.out.println("Digite o ano do seu nascimento: ");
        ano = sc.nextInt();

        String dataEmString = dia + "/" + mes + "/" + ano;
        //criando data de nascimento como Date
        Date dataNascimento = formmatter.parse(dataEmString);
        //pegando data de hj
        Date hoje = new Date();

        // Calcular a diferença em milisegundos
        long diferencaEmMiliSegs = hoje.getTime() - dataNascimento.getTime();

        //Converter os milisegundos para dias
        long diasAteHoje = diferencaEmMiliSegs / (24 * 60 * 60 * 1000);

        System.out.println("Esse individuou viveu " + diasAteHoje + " dias na Terra.");

    }

    public static void main(String[] args) throws ParseException {
        //setando a localização da lingua
        Locale ptBr = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in);

        int option;

        System.out.println("Deseja calcular sua idade usando uma biblioteca Java(1) ou um algoritmo simples(2)? (0 para sair)");
        option = sc.nextInt();

        //Menu
        while (option != 0) {

            if (option == 1){
                WithLibChronoUnit(ptBr, sc);

                System.out.println("Por favor escolha uma das opções: Biblioteca Java (1) Algoritmo Simples (2) ou Sair (0)");
                option = sc.nextInt();
            } else if (option == 2){
                WithoutLib(ptBr, sc);

                System.out.println("Por favor escolha uma das opções: Biblioteca Java (1) Algoritmo Simples (2) ou Sair (0)");
                option = sc.nextInt();
            } else {
                System.out.println("Por favor escolha uma das opções: Biblioteca Java (1) Algoritmo Simples (2) ou Sair (0)");
                option = sc.nextInt();
            }
        }

        System.out.println("Fim do programa!");
        sc.close();

    }
}
