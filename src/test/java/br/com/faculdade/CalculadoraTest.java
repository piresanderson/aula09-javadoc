package br.com.faculdade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    void deveDividir() {
        assertEquals(5, calc.divide(10, 2));
    }

    @Test
    void deveLancarErroAoDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }

    @Test
    void deveMultiplicar() {
        assertEquals(12, calc.multiplica(3, 4));
    }
}
