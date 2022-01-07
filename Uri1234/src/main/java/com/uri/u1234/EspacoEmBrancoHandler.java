package com.uri.u1234;

public class EspacoEmBrancoHandler extends  Condicao {

    public EspacoEmBrancoHandler(Condicao condition) {
        super(condition);
    }

    @Override
    public PropriedadesLetra aplicarCondicao(PropriedadesLetra letra) {
        if(Character.isSpaceChar(letra.getLetra())){
            return letra;
        }
        return proximoHandler.aplicarCondicao(letra);
    }
}
