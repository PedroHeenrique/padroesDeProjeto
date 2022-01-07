package com.uri.u1234;

import java.io.IOException;
import java.util.Scanner;

public class Uri1234 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String sentenca;

        while(sc.hasNextLine()){
            sentenca =sc.nextLine();
            String dancante = tornarSequenciaDancante(sentenca);
            System.out.println(dancante);
        }
        sc.close();

    }

    public static String tornarSequenciaDancante(String sentenca) {
        char[] sequenciaDancante = new char[sentenca.length()];

        char primeiraletra = getPrimeiraletra(sentenca);

        int posicaoPrimeiraLetra = sentenca.toUpperCase().indexOf(primeiraletra);

        for(int indice = 0; indice< sentenca.length(); indice++){
            char letraPosionada = sentenca.charAt(indice);
            PropriedadesLetra propriedadesLetra = new PropriedadesLetra(letraPosionada, indice,posicaoPrimeiraLetra);

            Condicao condicao = new EspacoEmBrancoHandler(
                                new PrimeiraLetraHandler(
                               new DeterminaUpperOuLowerHandler()));

            sequenciaDancante[indice] = condicao.aplicarCondicao(propriedadesLetra).getLetra();

        }
        return new String(sequenciaDancante);

    }

    private static char getPrimeiraletra(String sentenca) {
       return (char) sentenca.chars()
                           .filter(Character::isLetter)
                           .map(letra -> Character.toString(letra).toUpperCase().charAt(0))
                           .limit(1)
                           .findFirst()
                           .orElse(0);

    }


}
