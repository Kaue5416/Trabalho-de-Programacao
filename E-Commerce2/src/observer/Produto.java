package observer;

/**
 * Representa o Observável concreto, o item que os clientes
 * (Observers) estão observando (ex: um produto em estoque).
 */
public class Produto extends Subject {
    private String nome;
    private int estoque;

    public Produto(String nome, int estoque) {
        this.nome = nome;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }

    /**
     * Simula a reposição do estoque.
     * Quando o estoque é alterado, notifica os Observers.
     */
    public void reporEstoque(int quantidade) {
        System.out.println("\n--- REPOSIÇÃO DE ESTOQUE ---");
        System.out.println("Produto: " + nome + ". Estoque anterior: " + estoque);

        this.estoque += quantidade;
        System.out.println("Novo Estoque: " + estoque);

        // Notifica todos os Observers (clientes) que o estado mudou
        if (this.estoque > 0) {
            String mensagem = nome + " está **AGORA EM ESTOQUE** (" + estoque + " unidades)!";
            notifyObservers(new NotificacaoProduto(mensagem));
        }

        System.out.println("---------------------------\n");
    }

    // Você também pode ter métodos que notifiquem o status de forma padrão
    public void alterarPreco(double novoPreco) {
        System.out.println("\n--- ALTERAÇÃO DE PREÇO ---");
        System.out.println("Preço de " + nome + " alterado para R$ " + novoPreco);
        // Usa o método utilitário padrão herdado de Subject
        notificarObservers();
        System.out.println("---------------------------\n");
    }
}
