package br.com.faculdade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificacaoServiceTest {

    private final NotificacaoService service = new NotificacaoService();

    @Test
    void deveEnviarParaEmailValido() {
        assertTrue(service.enviarEmail("joao.silva@faculdade.edu.br", "Olá"));
    }

    @Test
    void deveRejeitarEmailSemArroba() {
        assertThrows(IllegalArgumentException.class,
                () -> service.enviarEmail("joao.faculdade.com", "Olá"));
    }

    @Test
    void deveRejeitarEmailSemDominio() {
        assertThrows(IllegalArgumentException.class,
                () -> service.enviarEmail("joao@", "Olá"));
    }

    @Test
    void deveRejeitarEmailNulo() {
        assertThrows(IllegalArgumentException.class,
                () -> service.enviarEmail(null, "Olá"));
    }
}
