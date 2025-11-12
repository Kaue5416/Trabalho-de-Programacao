package factoryMethod;

import java.math.BigDecimal;

public class PagamentoBoleto implements Pagamento {
    @Override
    public boolean processarPagamento(BigDecimal valor) {
        System.out.println("Gerando boleto para R$ " + valor.toPlainString());
        return true;
    }
    @Override
	public String getNome() {
		return "BOLETO";
	}
}
