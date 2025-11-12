package factoryMethod;

import java.math.BigDecimal;

public class PagamentoCartao implements Pagamento {
	@Override
	public boolean processarPagamento(BigDecimal valor) {
		System.out.println("Processando Cartão de R$ " + valor.toPlainString());
		return true;
	}

	@Override
	public String getNome() {
		return "CARTAO";
	}
}
