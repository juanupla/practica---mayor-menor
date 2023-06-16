package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.List;

public class MazoTest {
    Mazo mazo = new Mazo();

    @Test
    @DisplayName("cantidad de cartas esperadas")
    public void testCase() throws Exception{

        Method metodoPrivado = Mazo.class.getDeclaredMethod("inicializarMazo");
        metodoPrivado.setAccessible(true);
        List<Carta> cartas = (List<Carta>) metodoPrivado.invoke(mazo);
        int expected = 40;
        int tamanio = cartas.size();
        Assertions.assertEquals(expected,tamanio);
    }
    @Test
    @DisplayName("fin del juego")
    public void testCase2(){
        String result = mazo.finJuego();
        String expected = "el mazo se ha terminado!!";
        Assertions.assertEquals(expected,result);
    }

}
