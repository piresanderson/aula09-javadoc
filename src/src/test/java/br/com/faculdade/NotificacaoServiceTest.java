package br.com.faculdade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificacaoServiceTest {

    private final NotificacaoService service = new NotificacaoService();

    @Test
    void deveEnviarParaEmailValido() {
        assertTrue(service.enviarEmail("joao.silva@faculdade.edu.br", "Olá"));
    }
}
