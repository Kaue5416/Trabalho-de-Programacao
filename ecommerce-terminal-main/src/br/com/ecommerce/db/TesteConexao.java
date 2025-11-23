package br.com.ecommerce.db;

public class TesteConexao {
    public static void main(String[] args) {

        try {
            var conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
            conn.close();

        } catch (Exception e) {
            System.out.println("Falha: " + e.getMessage());
        }

    }
}