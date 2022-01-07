package com.uri.u1234;

public class PropriedadesLetra {
    private  final char letra;
    private  int posicaoNaPalavra;
    private  int posicaoPrimeiraLetra;
    private  static boolean applyUpperNext;


    public PropriedadesLetra(char letra){
        this.letra = letra;
    }

    public PropriedadesLetra( char letra, int posicaoNaPalavra, int posicaoPrimeiraLetra){
        this.letra = letra;
        this.posicaoNaPalavra = posicaoNaPalavra;
        this.posicaoPrimeiraLetra = posicaoPrimeiraLetra;
    }

    public char getLetra(){
        return letra;
    }

    public int getPosicaoNaPalavra(){
        return posicaoNaPalavra;
    }

    public int getPosicaoPrimeiraLetra(){
        return posicaoPrimeiraLetra;
    }

    public static boolean isApplyUpperNext() {
        return applyUpperNext;
    }

    public static void setApplyUpperNext(boolean applyUpperNext) {
        PropriedadesLetra.applyUpperNext = applyUpperNext;
    }
}
