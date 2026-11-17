package br.com.faculdade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    void deveDividir() {
        assertEquals(5, calc.divide(10, 2));
    }
}
