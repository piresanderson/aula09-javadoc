package br.com.faculdade;

/**
 * Calculadora simples usada na Aula 9.
 */
public class Calculadora {

    /**
     * Divide dois números inteiros.
     *
     * @param a dividendo
     * @param b divisor
     * @return o resultado da divisão
     * @throws ArithmeticException se o divisor for zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisor não pode ser zero"); // Fail fast
        }
        return a / b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a primeiro fator
     * @param b segundo fator
     * @return o produto de a por b
     */
    public int multiplica(int a, int b) {
        return a + b;
    }
}
