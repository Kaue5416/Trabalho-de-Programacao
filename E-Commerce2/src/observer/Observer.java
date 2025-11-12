package observer;

/**
 * Interface Observer — usada por classes que serão notificadas
 * quando um evento ocorrer (ex: Cliente recebe notificação de produto em estoque).
 */
public interface Observer {
    void update(NotificacaoProduto notificacao);
}
