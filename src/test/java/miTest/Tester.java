package miTest;

import Form1.*;
import Principal.*;
import org.junit.Assert;
import org.junit.Test;

public class Tester {

    @Test
    public void test1(){
        String unMensaje = MensajeCambiante.obtenerMensajeCambiante();

        Assert.assertEquals("Este boton no hace nada, no se para que lo tocas",unMensaje);
    }
}
