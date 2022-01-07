package com.uri.u1234;

public class PrimeiraLetraHandler extends Condicao{

    public PrimeiraLetraHandler(Condicao condicao){
        super(condicao);
    }

    @Override
    public PropriedadesLetra aplicarCondicao(PropriedadesLetra letra) {
        if(letra.getPosicaoNaPalavra() == letra.getPosicaoPrimeiraLetra()){
            PropriedadesLetra.setApplyUpperNext(false);
            return new PropriedadesLetra(tornarMaiuculaEssa(letra.getLetra()));
        }
        return proximoHandler.aplicarCondicao(letra);
    }
}
