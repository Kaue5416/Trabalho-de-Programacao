package observer;

public class Main {
    public static void main(String[] args) {
        // 1. Criar o Observável (Produto) com estoque zerado
        Produto smartphone = new Produto("Smartphone X", 0);
        System.out.println("Produto " + smartphone.getNome() + " criado com estoque 0.");

        // 2. Criar os Observers (Clientes)
        Cliente clienteA = new Cliente("Ana");
        Cliente clienteB = new Cliente("Beto");
        Cliente clienteC = new Cliente("Carlos");

        // 3. Clientes se inscrevem para observar o Produto (adicionar Observer)
        System.out.println("\nClientes se inscrevendo para receber notificação:");
        smartphone.addObserver(clienteA);
        smartphone.addObserver(clienteB);
        smartphone.addObserver(clienteC);

        // Cliente C decide não querer mais a notificação
        smartphone.removeObserver(clienteC);
        System.out.println("  -> Cliente Carlos desistiu da notificação.");
        
        System.out.println("Total de observers ativos: " + smartphone.getObservers().size());

        // 4. Mudar o estado do Observável (repor estoque) -> Notificação acionada
        System.out.println("\n--- MUDANÇA DE ESTADO: REPOSIÇÃO DE ESTOQUE ---");
        smartphone.reporEstoque(50); // Isso chamará notifyObservers internamente

        // 5. Outra mudança de estado, usando a notificação padrão do Subject
        smartphone.alterarPreco(1500.00);
    }
}
