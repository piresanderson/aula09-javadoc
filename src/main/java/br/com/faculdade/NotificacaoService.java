package br.com.faculdade;

/**
 * Serviço responsável pelo envio de notificações.
 */
public class NotificacaoService {

    /**
     * Simula o envio de um e-mail.
     *
     * @param destinatario e-mail do destinatário
     * @param mensagem texto da mensagem
     * @return true se o e-mail foi enviado
     */
    public boolean enviarEmail(String destinatario, String mensagem) {
        if (!destinatario.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido");
        }
        System.out.println("Enviando para " + destinatario + ": " + mensagem);
        return true;
    }
}
