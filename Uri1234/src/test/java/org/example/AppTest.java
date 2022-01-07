package org.example;

import static org.junit.Assert.assertEquals;

import com.uri.u1234.Uri1234;

import org.junit.Test;

public class AppTest 
{

    @Test
    public void eParaRetornarSequenciaDancente()
    {
        String dancante = Uri1234.tornarSequenciaDancante("This is a dancing sentence");
        assertEquals( "Sequecia dancante aplicada com sucesso","ThIs Is A dAnCiNg SeNtEnCe",dancante);
    }


    @Test
    public void sequenciaDancanteComPalavrasMinusculas(){
        String dancante = Uri1234.tornarSequenciaDancante("  This   is         a  dancing   sentence ");
        assertEquals( "Sequecia dancante aplicada com sucesso","  ThIs   Is         A  dAnCiNg   SeNtEnCe ",dancante);
    }

    @Test
    public void sequenciaDancanteDeCaracteresIguais(){
        String dancante = Uri1234.tornarSequenciaDancante("aaaaaaaaaaa");
        assertEquals( "Sequecia dancante aplicada com sucesso","AaAaAaAaAaA",dancante);
    }

    @Test
    public void sequenciaDancanteUmUnicoCaractere(){
        String dancante = Uri1234.tornarSequenciaDancante("z");
        assertEquals( "Sequecia dancante aplicada com sucesso","Z",dancante);
    }
}
