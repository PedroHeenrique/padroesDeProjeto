package com.uri.u1234;

public class DeterminaUpperOuLowerHandler extends Condicao{

    public DeterminaUpperOuLowerHandler() {
        super();
    }

    @Override
    public PropriedadesLetra aplicarCondicao(PropriedadesLetra letra) {
        if (PropriedadesLetra.isApplyUpperNext()){
            PropriedadesLetra.setApplyUpperNext(false);
            return new PropriedadesLetra(tornarMaiuculaEssa(letra.getLetra()));
        }else{
            PropriedadesLetra.setApplyUpperNext(true);
            return new PropriedadesLetra(tonarMinusculaEssa(letra.getLetra()));
        }

    }
}
