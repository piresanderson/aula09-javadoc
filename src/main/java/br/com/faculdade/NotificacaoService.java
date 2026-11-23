package br.com.faculdade;

import java.util.regex.Pattern;

/**
 * Serviço responsável pelo envio de notificações.
 */
public class NotificacaoService {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+$");

    /**
     * Simula o envio de um e-mail.
     *
     * @param destinatario e-mail do destinatário
     * @param mensagem texto da mensagem
     * @return true se o e-mail foi enviado
     * @throws IllegalArgumentException se o e-mail for nulo ou inválido
     */
    public boolean enviarEmail(String destinatario, String mensagem) {
        if (destinatario == null || !EMAIL_PATTERN.matcher(destinatario).matches()) {
            throw new IllegalArgumentException("E-mail inválido: " + destinatario);
        }
        System.out.println("Enviando para " + destinatario + ": " + mensagem);
        return true;
    }
}
