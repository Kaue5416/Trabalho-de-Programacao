package observer;

import java.time.LocalDateTime;

/**
 * Representa uma mensagem de notificação enviada ao cliente
 * (ex: quando o produto volta ao estoque).
 */
public class NotificacaoProduto {
    private final String mensagem;
    private final LocalDateTime data;

    public NotificacaoProduto(String mensagem) {
        this.mensagem = mensagem;
        this.data = LocalDateTime.now();
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getData() {
        return data;
    }

    @Override
    public String toString() {
        return "[" + data + "] " + mensagem;
    }
}
