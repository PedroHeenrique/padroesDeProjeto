package com.uri.u1234;

public abstract class Condicao {

    protected Condicao proximoHandler;

    public Condicao(){

    }

    public Condicao(Condicao condition){
        this.proximoHandler = condition;

    }

    public abstract PropriedadesLetra aplicarCondicao(PropriedadesLetra letra);

    public char tornarMaiuculaEssa(char letra){
        return Character.toString(letra).toUpperCase().charAt(0);
    }

    public char tonarMinusculaEssa(char letra){
        return Character.toString(letra).toLowerCase().charAt(0);
    }

}
