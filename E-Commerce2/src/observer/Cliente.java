package observer;

/**
 * Representa o Observer concreto (ex: um cliente que quer ser notificado
 * quando um produto voltar ao estoque).
 */
public class Cliente implements Observer {
    private final String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    /**
     * Método chamado pelo Observável (Produto) quando há uma alteração de estado.
     */
    @Override
    public void update(NotificacaoProduto notificacao) {
        System.out.println("CLIENTE " + nome + " RECEBEU NOTIFICAÇÃO:");
        System.out.println("  -> " + notificacao.toString());
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome='" + nome + '\'' + '}';
    }
}
